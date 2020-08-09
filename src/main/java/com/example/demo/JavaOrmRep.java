/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author xuhongxin
 * @version : JavaOrmRep.java, v 0.1 2020年08月09日 13:18 xuhongxin Exp $
 */
public interface JavaOrmRep extends JpaRepository<JavaOrm,Integer> {

    List<JavaOrm> findJavaOrmsByName(String name);
}