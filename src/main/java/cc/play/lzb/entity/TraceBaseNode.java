package cc.play.lzb.entity;

import lombok.Data;

@Data
public class TraceBaseNode {

  private Long id;
	/* ID */
  private String seqId;
	/* 城市编码 */
  private String cityCode;
	/* 区县 */
  private String areaCode;
	/* 统一社会信用代码 */
  private String socialCreditCode;
	/* 法人责任主体名称 */
  private String compName;
	/* 法人责任主体类型 */
  private String legalType;
	/* 法人代表 */
  private String legalPerson;
	/* 法人身份证号码 */
  private String legalId;
	/* 备案日期 */
  private String recordDate;
	/* 工商注册日期 */
  private String issuingTime;
	/* 工商有效期 */
  private String termOfValidity;
	/* 所属企业编码 */
  private String recordNodeId;
	/* 所属企业名称 */
  private String recordNodeName;
	/* 经营地址 */
  private String address;
	/* 经度 */
  private double longitude;
	/* 纬度 */
  private double latitude;
	/* 联系人 */
  private String contacts;
	/* 联系电话 */
  private String tel;
	/* 传真 */
  private String fax;
	/* 环节类型 */
  private String nodeType;
	/* 主要大类代码 */
  private String classType;
	/* 行业代码 */
  private String industryCode;
  private String issend;
  private Long delFlg;
  private Long createDate;
  private Long updateDate;
  private String authId;
  private java.sql.Timestamp updateTime;
	/* 备案类型 */
  private String regType;
  private String authName;
  private String updatetime;
  private String batchId;
  private String cityName;
  private String areaName;
  private String nodeTypeName;
  private String classTypeName;
	/* 1认证企业2信用企业3黑名单 */
  private String state;
  private Long businessNum;
	/* 3认证企业、2黑名单、1重点企业 */
  private String credit;
  private String whetherHelp;
  private String mainCode;
  private String qrCode;
  private String busiCategory;
  private String busiNo;
  private String bsState;
  private String bsScope;
	/* 申请时间 */
  private java.sql.Timestamp applytime;
	/* 审核时间 */
  private java.sql.Timestamp reviewtime;

}
