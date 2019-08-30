package com.baymax.springbootmultidatasourcejpa.repository.primary;

import com.baymax.springbootmultidatasourcejpa.entity.primary.PrimaryApp;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bx
 * @date 8/30/2019 11:18 AM
 */
public interface AppRepository extends JpaRepository<PrimaryApp, String> {
}
