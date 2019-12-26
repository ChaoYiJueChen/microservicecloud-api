package com.everjiankang.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor //有参构造函数，所有属性
@NoArgsConstructor	//默认无参数构造函数
@Data //get set toString
@Accessors(chain = true) //链式变成
public class Dept implements Serializable {  //必须序列化
	
	private static final long serialVersionUID = 5892222329061258978L;

    // 主键
    private Long     deptno;

    // 部门名称
    private String     dname;

    // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String     db_source;

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
}