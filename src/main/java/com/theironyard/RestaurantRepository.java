package com.theironyard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zach on 6/21/16.
 */
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
    public Iterable<Restaurant> findByRating(int rating);
    public Iterable<Restaurant> findByLocation(String location);
    public Iterable<Restaurant> findByUser(User user);

    @Query("SELECT r FROM Restaurant r WHERE r.location LIKE ?1%")
    public Iterable<Restaurant> searchLocation(String location);
}
