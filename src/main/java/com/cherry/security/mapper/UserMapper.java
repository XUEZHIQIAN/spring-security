package com.cherry.security.mapper;

import com.cherry.security.model.People;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 *
 * @author Hang W
 */
@Mapper
public interface UserMapper {

    /**
     * queryUserById
     *
     * @param id
     * @return
     */
    People queryUserById(Long id);

}
