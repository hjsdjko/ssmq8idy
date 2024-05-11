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


import com.dao.FangyicuoshiDao;
import com.entity.FangyicuoshiEntity;
import com.service.FangyicuoshiService;
import com.entity.vo.FangyicuoshiVO;
import com.entity.view.FangyicuoshiView;

@Service("fangyicuoshiService")
public class FangyicuoshiServiceImpl extends ServiceImpl<FangyicuoshiDao, FangyicuoshiEntity> implements FangyicuoshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyicuoshiEntity> page = this.selectPage(
                new Query<FangyicuoshiEntity>(params).getPage(),
                new EntityWrapper<FangyicuoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyicuoshiEntity> wrapper) {
		  Page<FangyicuoshiView> page =new Query<FangyicuoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyicuoshiVO> selectListVO(Wrapper<FangyicuoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyicuoshiVO selectVO(Wrapper<FangyicuoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyicuoshiView> selectListView(Wrapper<FangyicuoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyicuoshiView selectView(Wrapper<FangyicuoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
