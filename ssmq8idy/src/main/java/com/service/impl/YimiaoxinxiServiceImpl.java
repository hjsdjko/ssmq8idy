package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YimiaoxinxiDao;
import com.entity.YimiaoxinxiEntity;
import com.service.YimiaoxinxiService;
import com.entity.vo.YimiaoxinxiVO;
import com.entity.view.YimiaoxinxiView;

@Service("yimiaoxinxiService")
public class YimiaoxinxiServiceImpl extends ServiceImpl<YimiaoxinxiDao, YimiaoxinxiEntity> implements YimiaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaoxinxiEntity> page = this.selectPage(
                new Query<YimiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<YimiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaoxinxiEntity> wrapper) {
		  Page<YimiaoxinxiView> page =new Query<YimiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaoxinxiVO> selectListVO(Wrapper<YimiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaoxinxiVO selectVO(Wrapper<YimiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaoxinxiView> selectListView(Wrapper<YimiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaoxinxiView selectView(Wrapper<YimiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
