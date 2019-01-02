package com.dimple.service;

import com.dimple.bean.Blog;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: FrontService
 * @Description:
 * @Auther: Owenb
 * @Date: 12/17/18 15:38
 * @Version: 1.0
 */
public interface FrontService {
    /**
     * 获取首页显示的分类的数据信息
     * Map的key为分类的名称
     * Map的value为分类下的具体的博客的信息
     *
     * @return
     */
    Map<String, List<Blog>> getCategoryInfo();

    /**
     * 获取首页展示的Category的名字
     *
     * @return
     */
    List<String> selectCategoryNameToDisplay();

    List<List<Blog>> getBlogsInfo();

    /**
     * 获取大家在看的博文
     *
     * @return
     */
    List<Blog> getBlogsPeopleSee();

    /**
     * 获取最新博文
     *
     * @param pageable
     * @return
     */
    List<Map<String, Object>> getNewestBlog(Pageable pageable);

    /**
     * 根据Blog的Id获取博客
     *
     * @param id
     * @return
     */
    Blog getBlog(Integer id);

    /**
     * 获取点击次数最高的前8条数据
     *
     * @return
     */
    List<Blog> getClickBlog();

    /**
     * 获取置顶推荐的博客
     *
     * @return
     */
    List<Blog> getSupportBlog();

    Map<String, Blog> getBlogOtherInfo(Integer id);


    List<Blog> getNewestUpdateBlog();

    Map<String, String> getCategoryInfoByCategoryId(Integer id);

    Blog getBlogInfo(Integer id);
}
