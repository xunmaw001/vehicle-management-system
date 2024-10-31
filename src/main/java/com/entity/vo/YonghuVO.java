package com.entity.vo;

import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yonghu")
public class YonghuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户姓名
     */

    @TableField(value = "yonghu_name")
    private String yonghuName;


    /**
     * 用户手机号
     */

    @TableField(value = "yonghu_phone")
    private String yonghuPhone;


    /**
     * 用户身份证号
     */

    @TableField(value = "yonghu_id_number")
    private String yonghuIdNumber;


    /**
     * 用户头像
     */

    @TableField(value = "yonghu_photo")
    private String yonghuPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 准驾车型
     */

    @TableField(value = "zhunjia_types")
    private Integer zhunjiaTypes;


    /**
     * 驾驶证
     */

    @TableField(value = "jiashizhenghao")
    private String jiashizhenghao;


    /**
     * 用户备注
     */

    @TableField(value = "yonghu_content")
    private String yonghuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：用户姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 获取：用户姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：用户手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 获取：用户手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 设置：用户身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 获取：用户身份证号
	 */

    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 设置：用户头像
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：用户头像
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：准驾车型
	 */
    public Integer getZhunjiaTypes() {
        return zhunjiaTypes;
    }


    /**
	 * 获取：准驾车型
	 */

    public void setZhunjiaTypes(Integer zhunjiaTypes) {
        this.zhunjiaTypes = zhunjiaTypes;
    }
    /**
	 * 设置：驾驶证
	 */
    public String getJiashizhenghao() {
        return jiashizhenghao;
    }


    /**
	 * 获取：驾驶证
	 */

    public void setJiashizhenghao(String jiashizhenghao) {
        this.jiashizhenghao = jiashizhenghao;
    }
    /**
	 * 设置：用户备注
	 */
    public String getYonghuContent() {
        return yonghuContent;
    }


    /**
	 * 获取：用户备注
	 */

    public void setYonghuContent(String yonghuContent) {
        this.yonghuContent = yonghuContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
