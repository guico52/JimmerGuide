package com.guico.jimmerguide.repository

import com.guico.jimmerguide.entity.TreeNode
import org.babyfish.jimmer.spring.repository.KRepository
import org.springframework.stereotype.Repository

/**
 * <p>
 * TreeNodeRepository 接口
 * </p>
 *
 * @author guico
 * @date 2025-02-24
 */
@Repository
public interface TreeNodeRepository : KRepository<TreeNode, Long> {

}

