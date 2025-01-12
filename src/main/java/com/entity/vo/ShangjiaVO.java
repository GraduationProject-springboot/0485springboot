package com.entity.vo;

import com.entity.ShangjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商家
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangjia")
public class ShangjiaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 商家名称
     */

    @TableField(value = "shangjia_name")
    private String shangjiaName;


    /**
     * 联系方式
     */

    @TableField(value = "shangjia_phone")
    private String shangjiaPhone;


    /**
     * 邮箱
     */

    @TableField(value = "shangjia_email")
    private String shangjiaEmail;


    /**
     * 营业执照展示
     */

    @TableField(value = "shangjia_photo")
    private String shangjiaPhoto;


    /**
     * 店铺位置
     */

    @TableField(value = "shangjia_address")
    private String shangjiaAddress;


    /**
     * 区域
     */

    @TableField(value = "quyu_types")
    private Integer quyuTypes;


    /**
     * 商家信用类型
     */

    @TableField(value = "shangjia_xingji_types")
    private Integer shangjiaXingjiTypes;


    /**
     * 现有余额
     */

    @TableField(value = "new_money")
    private Double newMoney;


    /**
     * 商家介绍
     */

    @TableField(value = "shangjia_content")
    private String shangjiaContent;


    /**
     * 账户状态
     */

    @TableField(value = "jinyong_types")
    private Integer jinyongTypes;


    /**
     * 申请状态
     */

    @TableField(value = "shangjia_yesno_types")
    private Integer shangjiaYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "shangjia_yesno_text")
    private String shangjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shangjia_shenhe_time")
    private Date shangjiaShenheTime;


    /**
     * 逻辑删除
     */

    @TableField(value = "shangjia_delete")
    private Integer shangjiaDelete;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：商家名称
	 */
    public String getShangjiaName() {
        return shangjiaName;
    }


    /**
	 * 获取：商家名称
	 */

    public void setShangjiaName(String shangjiaName) {
        this.shangjiaName = shangjiaName;
    }
    /**
	 * 设置：联系方式
	 */
    public String getShangjiaPhone() {
        return shangjiaPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setShangjiaPhone(String shangjiaPhone) {
        this.shangjiaPhone = shangjiaPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getShangjiaEmail() {
        return shangjiaEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setShangjiaEmail(String shangjiaEmail) {
        this.shangjiaEmail = shangjiaEmail;
    }
    /**
	 * 设置：营业执照展示
	 */
    public String getShangjiaPhoto() {
        return shangjiaPhoto;
    }


    /**
	 * 获取：营业执照展示
	 */

    public void setShangjiaPhoto(String shangjiaPhoto) {
        this.shangjiaPhoto = shangjiaPhoto;
    }
    /**
	 * 设置：店铺位置
	 */
    public String getShangjiaAddress() {
        return shangjiaAddress;
    }


    /**
	 * 获取：店铺位置
	 */

    public void setShangjiaAddress(String shangjiaAddress) {
        this.shangjiaAddress = shangjiaAddress;
    }
    /**
	 * 设置：区域
	 */
    public Integer getQuyuTypes() {
        return quyuTypes;
    }


    /**
	 * 获取：区域
	 */

    public void setQuyuTypes(Integer quyuTypes) {
        this.quyuTypes = quyuTypes;
    }
    /**
	 * 设置：商家信用类型
	 */
    public Integer getShangjiaXingjiTypes() {
        return shangjiaXingjiTypes;
    }


    /**
	 * 获取：商家信用类型
	 */

    public void setShangjiaXingjiTypes(Integer shangjiaXingjiTypes) {
        this.shangjiaXingjiTypes = shangjiaXingjiTypes;
    }
    /**
	 * 设置：现有余额
	 */
    public Double getNewMoney() {
        return newMoney;
    }


    /**
	 * 获取：现有余额
	 */

    public void setNewMoney(Double newMoney) {
        this.newMoney = newMoney;
    }
    /**
	 * 设置：商家介绍
	 */
    public String getShangjiaContent() {
        return shangjiaContent;
    }


    /**
	 * 获取：商家介绍
	 */

    public void setShangjiaContent(String shangjiaContent) {
        this.shangjiaContent = shangjiaContent;
    }
    /**
	 * 设置：账户状态
	 */
    public Integer getJinyongTypes() {
        return jinyongTypes;
    }


    /**
	 * 获取：账户状态
	 */

    public void setJinyongTypes(Integer jinyongTypes) {
        this.jinyongTypes = jinyongTypes;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getShangjiaYesnoTypes() {
        return shangjiaYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setShangjiaYesnoTypes(Integer shangjiaYesnoTypes) {
        this.shangjiaYesnoTypes = shangjiaYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getShangjiaYesnoText() {
        return shangjiaYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setShangjiaYesnoText(String shangjiaYesnoText) {
        this.shangjiaYesnoText = shangjiaYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getShangjiaShenheTime() {
        return shangjiaShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setShangjiaShenheTime(Date shangjiaShenheTime) {
        this.shangjiaShenheTime = shangjiaShenheTime;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getShangjiaDelete() {
        return shangjiaDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShangjiaDelete(Integer shangjiaDelete) {
        this.shangjiaDelete = shangjiaDelete;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
