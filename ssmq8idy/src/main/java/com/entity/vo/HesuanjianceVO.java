package com.entity.vo;

import com.entity.HesuanjianceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 核酸检测
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
public class HesuanjianceVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
