package com.vladmihalcea.book.hpjp.hibernate.fetching.detector;

import org.hibernate.event.spi.PostLoadEvent;
import org.hibernate.event.spi.PostLoadEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Vlad Mihalcea
 */
public class AssociationFetchPostLoadEventListener implements PostLoadEventListener {

    public static final AssociationFetchPostLoadEventListener INSTANCE = new AssociationFetchPostLoadEventListener();

    @Override
    public void onPostLoad(PostLoadEvent event) {
        AssociationFetch.Context
            .get(event.getSession())
            .postLoad(event);
    }
}
