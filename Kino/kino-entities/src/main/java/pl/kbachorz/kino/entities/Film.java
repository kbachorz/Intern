package pl.kbachorz.kino.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by kbachorz on 03-Nov-16.
 */

    @Entity
    @Table(name = "film")
    public class Film {

        @Column(name = "film_id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "description")
        private String description;

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
