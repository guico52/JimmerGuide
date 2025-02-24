package com.guico.jimmerguide.entity

import java.time.LocalDateTime
import org.babyfish.jimmer.sql.*


/**
 * <p>
 *  tree_node

 * </p>
 *
 * @author guico
 * @date 2025-02-24
 */
@Entity
@Table(name = "tree_node")
public interface TreeNode {

    /**
     *  node_id

     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "node_id")
    val nodeId: Long

    /**
     *  name

     */
    @Key
    val name: String

    /**
     *  parent_id

     */
    @Key
    @Column(name = "parent_id")
    val parentId: Long?

    /**
     *  created_time

     */
    @Column(name = "created_time")
    val createdTime: LocalDateTime

    /**
     *  modified_time

     */
    @Column(name = "modified_time")
    val modifiedTime: LocalDateTime

}
