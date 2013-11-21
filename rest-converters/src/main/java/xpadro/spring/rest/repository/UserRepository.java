package xpadro.spring.rest.repository;

import xpadro.spring.rest.model.User;

/**
 * Manages data from users
 * 
 */
public interface UserRepository {

    /**
     * Returns the user identified by the id
     * 
     * @param id
     * @return the user
     */
    public User getUser(long id);
}
