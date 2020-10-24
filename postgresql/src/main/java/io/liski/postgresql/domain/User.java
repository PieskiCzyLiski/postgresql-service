package io.liski.postgresql.domain;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String email;
    private String name;

    @ManyToOne
    @JoinColumn(name="role_id")//, nullable=false
    private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reservation_id", referencedColumnName = "user_id")
    private Reservation reservation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "favourite_id", referencedColumnName = "user_id")
    private Favourite favourite;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long id) {
        this.user_id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Favourite getFavourite() {
        return favourite;
    }

    public void setFavourite(Favourite favourite) {
        this.favourite = favourite;
    }
}
