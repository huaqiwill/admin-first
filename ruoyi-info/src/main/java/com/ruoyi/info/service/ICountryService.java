package com.ruoyi.info.service;

import java.util.List;

import com.ruoyi.info.domain.Country;
import com.ruoyi.info.domain.dto.CommonDTO;

/**
 * 国家信息管理Service接口
 *
 * @author ruoyi
 * @date 2024-06-17
 */
public interface ICountryService {
    /**
     * 查询国家信息管理
     *
     * @param id 国家信息管理主键
     * @return 国家信息管理
     */
    public Country selectCountryById(Long id);

    /**
     * 查询国家信息管理列表
     *
     * @param country 国家信息管理
     * @return 国家信息管理集合
     */
    public List<Country> selectCountryList(Country country);


    public List<CommonDTO> selectCountryNameList();

    /**
     * 新增国家信息管理
     *
     * @param country 国家信息管理
     * @return 结果
     */
    public int insertCountry(Country country);

    /**
     * 修改国家信息管理
     *
     * @param country 国家信息管理
     * @return 结果
     */
    public int updateCountry(Country country);

    /**
     * 批量删除国家信息管理
     *
     * @param ids 需要删除的国家信息管理主键集合
     * @return 结果
     */
    public int deleteCountryByIds(Long[] ids);

    /**
     * 删除国家信息管理信息
     *
     * @param id 国家信息管理主键
     * @return 结果
     */
    public int deleteCountryById(Long id);
}
