package com.kaiser.blog.service.impl;

import com.kaiser.blog.entity.Picture;
import com.kaiser.blog.mapper.PictureMapper;
import com.kaiser.blog.service.IPictureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kaiser
 * @since 2019-01-26
 */
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture> implements IPictureService {

}
