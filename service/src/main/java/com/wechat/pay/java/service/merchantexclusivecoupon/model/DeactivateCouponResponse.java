// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销商家券对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.0.11

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.merchantexclusivecoupon.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** DeactivateCouponResponse */
public class DeactivateCouponResponse {
  /**
   * 系统失效成功的时间
   * 说明：系统券成功失效的时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
   */
  @SerializedName("wechatpay_deactivate_time")
  private String wechatpayDeactivateTime;

  public String getWechatpayDeactivateTime() {
    return wechatpayDeactivateTime;
  }

  public void setWechatpayDeactivateTime(String wechatpayDeactivateTime) {
    this.wechatpayDeactivateTime = wechatpayDeactivateTime;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeactivateCouponResponse {\n");
    sb.append("    wechatpayDeactivateTime: ")
        .append(toIndentedString(wechatpayDeactivateTime))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }
}