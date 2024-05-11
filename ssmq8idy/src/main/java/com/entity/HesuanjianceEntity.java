package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 核酸检测
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
@TableName("hesuanjiance")
public class HesuanjianceEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HesuanjianceEntity() {
		
	}
	
	public HesuanjianceEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 检测名称
	 */
					
	private String jiancemingcheng;
	
	/**
	 * 检测类型
	 */
					
	private String jianceleixing;
	
	/**
	 * 检测余量
	 */
					
	private Integer jianceyuliang;
	
	/**
	 * 检测费用
	 */
					
	private Float jiancefeiyong;
	
	/**
	 * 详情介绍
	 */
					
	private String xiangqingjieshao;
	
	/**
	 * 检测图片
	 */
					
	private String jiancetupian;
	
	/**
	 * 医院编号
	 */
					
	private String yiyuanbianhao;
	
	/**
	 * 医院名称
	 */
					
	private String yiyuanmingcheng;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：检测名称
	 */
	public void setJiancemingcheng(String jiancemingcheng) {
		this.jiancemingcheng = jiancemingcheng;
	}
	/**
	 * 获取：检测名称
	 */
	public String getJiancemingcheng() {
		return jiancemingcheng;
	}
	/**
	 * 设置：检测类型
	 */
	public void setJianceleixing(String jianceleixing) {
		this.jianceleixing = jianceleixing;
	}
	/**
	 * 获取：检测类型
	 */
	public String getJianceleixing() {
		return jianceleixing;
	}
	/**
	 * 设置：检测余量
	 */
	public void setJianceyuliang(Integer jianceyuliang) {
		this.jianceyuliang = jianceyuliang;
	}
	/**
	 * 获取：检测余量
	 */
	public Integer getJianceyuliang() {
		return jianceyuliang;
	}
	/**
	 * 设置：检测费用
	 */
	public void setJiancefeiyong(Float jiancefeiyong) {
		this.jiancefeiyong = jiancefeiyong;
	}
	/**
	 * 获取：检测费用
	 */
	public Float getJiancefeiyong() {
		return jiancefeiyong;
	}
	/**
	 * 设置：详情介绍
	 */
	public void setXiangqingjieshao(String xiangqingjieshao) {
		this.xiangqingjieshao = xiangqingjieshao;
	}
	/**
	 * 获取：详情介绍
	 */
	public String getXiangqingjieshao() {
		return xiangqingjieshao;
	}
	/**
	 * 设置：检测图片
	 */
	public void setJiancetupian(String jiancetupian) {
		this.jiancetupian = jiancetupian;
	}
	/**
	 * 获取：检测图片
	 */
	public String getJiancetupian() {
		return jiancetupian;
	}
	/**
	 * 设置：医院编号
	 */
	public void setYiyuanbianhao(String yiyuanbianhao) {
		this.yiyuanbianhao = yiyuanbianhao;
	}
	/**
	 * 获取：医院编号
	 */
	public String getYiyuanbianhao() {
		return yiyuanbianhao;
	}
	/**
	 * 设置：医院名称
	 */
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}

}
