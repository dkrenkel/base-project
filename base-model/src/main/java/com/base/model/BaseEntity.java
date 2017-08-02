/**
 * 
 */
package com.base.model;

import java.io.Serializable;

/**
 * The Base JPA Entity 
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 * @param <T> Id Entity type
 */
public interface BaseEntity<T extends Serializable> extends Serializable {

	public T getId();
}
