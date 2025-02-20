package com.atguigu.eduservice.service;

import com.atguigu.eduservice.entity.EduCourse;
import com.atguigu.eduservice.entity.vo.CourseInfoVo;
import com.atguigu.eduservice.entity.vo.CoursePublishVo;
import com.atguigu.eduservice.entity.vo.CourseQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author Ytz
 * @since 2022-08-17
 */
public interface EduCourseService extends IService<EduCourse> {

    /**
     * 保存课程和课程详情信息
     * @param courseInfo
     * @return 新生成的课程id
     */
    String saveCourseInfo(CourseInfoVo courseInfo);

    CourseInfoVo getCourseInfo(String courseId);

    void updateCourseInfo(CourseInfoVo courseInfoVo);

    CoursePublishVo getCoursePublishVoById(String id);

    void pageQuery(Page<EduCourse> pageParam, CourseQuery courseQuery);

    boolean removeCourseById(String id);
}
