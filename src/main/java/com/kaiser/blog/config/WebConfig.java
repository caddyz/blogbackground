package com.kaiser.blog.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

import static com.alibaba.fastjson.serializer.SerializerFeature.*;

/**
 * @ClassName WebConfig
 * @Description TODO 序列化配置
 * @Author Kaiser
 * @Date 2019/1/26 23:35
 * @Version 1.0
 **/
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(
                QuoteFieldNames,
                WriteMapNullValue,
                WriteNullNumberAsZero,
                WriteNullListAsEmpty,
                WriteNullStringAsEmpty,
                WriteNullBooleanAsFalse,
                WriteDateUseDateFormat,
                DisableCircularReferenceDetect
        );
        converter.setFastJsonConfig(config);
        converters.add(converter);
    }
}
