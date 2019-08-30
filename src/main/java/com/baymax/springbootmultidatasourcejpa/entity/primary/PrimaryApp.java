package com.baymax.springbootmultidatasourcejpa.entity.primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author bx
 * @date 8/30/2019 10:51 AM
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrimaryApp {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 名称
     */
    private String name;
}
