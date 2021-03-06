package com.twt.service.bike.bike.ui.announcement;

import android.content.Context;

import com.twt.service.bike.api.BikeApiClient;
import com.twt.service.bike.api.BikeApiSubscriber;
import com.twt.service.bike.api.OnNextListener;
import com.twt.service.bike.common.BikePresenter;
import com.twt.service.bike.model.BikeAnnouncement;

import java.util.List;

/**
 * Created by jcy on 16-8-20.
 */
public class AnnouncementPresenter extends BikePresenter {
    private AnnouncementViewController mViewController;

    public AnnouncementPresenter(Context context, AnnouncementViewController viewController) {
        super(context);
        mViewController = viewController;
    }

    public void getAnnouncement() {
        BikeApiClient.getInstance().getAnnouncement(mContext, new BikeApiSubscriber<>(mContext, mListener));
    }

    private OnNextListener<List<BikeAnnouncement>> mListener = new OnNextListener<List<BikeAnnouncement>>() {
        @Override
        public void onNext(List<BikeAnnouncement> bikeAnnouncements) {
            mViewController.setAnnouncementList(bikeAnnouncements);
        }
    };
}
