/**
 * @Title: CategoryListVo.java
 * @Package com.profession.plan.vo.category.response
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 * @version V1.0
 */
package com.profession.plan.vo.category.response;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: CategoryListVo
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
@ApiModel
public class CategoryListVo {

	@ApiModelProperty("类目id")
	private Long id;
	
	@ApiModelProperty("类目名称")
	private String name;

	@ApiModelProperty("子类目信息")
	private List<CategoryListVo> categoryListVos;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CategoryListVo> getCategoryListVos() {
		return categoryListVos;
	}

	public void setCategoryListVos(List<CategoryListVo> categoryListVos) {
		this.categoryListVos = categoryListVos;
	}
}
