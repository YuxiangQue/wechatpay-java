// Copyright 2021 Tencent Inc. All rights reserved.
//
// 支付有礼活动对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.1.2

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.giftactivity.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** AddActivityMerchantResponse */
public class AddActivityMerchantResponse {
  /** 活动Id 说明：活动Id */
  @SerializedName("activity_id")
  private String activityId;
  /** 校验失败的发券商户号 说明：未通过规则校验的发券商户号列表 */
  @SerializedName("invalid_merchant_id_list")
  private List<InvalidParticipateMerchant> invalidMerchantIdList;
  /** 添加时间 说明：成功添加发券商户号的时间 */
  @SerializedName("add_time")
  private String addTime;

  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public List<InvalidParticipateMerchant> getInvalidMerchantIdList() {
    return invalidMerchantIdList;
  }

  public void setInvalidMerchantIdList(List<InvalidParticipateMerchant> invalidMerchantIdList) {
    this.invalidMerchantIdList = invalidMerchantIdList;
  }

  public String getAddTime() {
    return addTime;
  }

  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddActivityMerchantResponse {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    invalidMerchantIdList: ")
        .append(toIndentedString(invalidMerchantIdList))
        .append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}