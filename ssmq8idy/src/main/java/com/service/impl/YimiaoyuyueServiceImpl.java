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


import com.dao.YimiaoyuyueDao;
import com.entity.YimiaoyuyueEntity;
import com.service.YimiaoyuyueService;
import com.entity.vo.YimiaoyuyueVO;
import com.entity.view.YimiaoyuyueView;

@Service("yimiaoyuyueService")
public class YimiaoyuyueServiceImpl extends ServiceImpl<YimiaoyuyueDao, YimiaoyuyueEntity> implements YimiaoyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaoyuyueEntity> page = this.selectPage(
                new Query<YimiaoyuyueEntity>(params).getPage(),
                new EntityWrapper<YimiaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaoyuyueEntity> wrapper) {
		  Page<YimiaoyuyueView> page =new Query<YimiaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaoyuyueVO> selectListVO(Wrapper<YimiaoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaoyuyueVO selectVO(Wrapper<YimiaoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaoyuyueView> selectListView(Wrapper<YimiaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaoyuyueView selectView(Wrapper<YimiaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
