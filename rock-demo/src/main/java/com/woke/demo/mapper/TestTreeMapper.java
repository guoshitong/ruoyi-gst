package com.woke.demo.mapper;

import com.woke.common.annotation.DataColumn;
import com.woke.common.annotation.DataPermission;
import com.woke.common.core.mapper.BaseMapperPlus;
import com.woke.demo.domain.TestTree;
import com.woke.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTreeMapper, TestTree, TestTreeVo> {

}
