package com.entity.view;

import com.entity.YimiaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
@TableName("yimiaoyuyue")
public class YimiaoyuyueView  extends YimiaoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaoyuyueView(){
	}
 
 	public YimiaoyuyueView(YimiaoyuyueEntity yimiaoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
