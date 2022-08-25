package org.acme.quickstart;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "states")
@NamedQuery(name = "States.findAll", query = "SELECT s FROM State s ORDER BY s.state", hints = @QueryHint(name = "org.hibernate.cacheable", value = "true"))
@Cacheable
public class State {

    @Id
    @SequenceGenerator(name = "stateSequence", sequenceName = "state_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "stateSequence")
    private Integer id;

    @Column(length = 40, unique = true)
    private String state;

    public State() {
    }

    public State(String name) {
        this.state = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return state;
    }

    public void setName(String name) {
        this.state = name;
    }

}
