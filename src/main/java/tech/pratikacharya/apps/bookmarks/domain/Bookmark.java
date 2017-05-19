package tech.pratikacharya.apps.bookmarks.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Pratik Acharya on 5/14/2017.
 */

@Entity
public class Bookmark {

    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    public String uri;
    public String description;

    public Bookmark() {
    }

    public Bookmark(Account account, String uri, String description) {
        this.uri = uri;
        this.description = description;
        this.account = account;
    }



    public Account getAccount() {
        return account;
    }

    public Long getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }

    public String getDescription() {
        return description;
    }
}
