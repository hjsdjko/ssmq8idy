package com.entity.view;

import com.entity.FangyicuoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 防疫措施
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
@TableName("fangyicuoshi")
public class FangyicuoshiView  extends FangyicuoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangyicuoshiView(){
	}
 
 	public FangyicuoshiView(FangyicuoshiEntity fangyicuoshiEntity){
 	try {
			BeanUtils.copyProperties(this, fangyicuoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
