package com.studytrial.profileinstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load(R.drawable.foto_profil)
            .circleCrop()
            .into(iv_photo_profil)

        Glide.with(this)
            .load(R.drawable.ic_baseline_add_circle_24)
            .circleCrop()
            .into(iv_add)

        Glide.with(this)
            .load(R.drawable.ic_baseline_add_circle)
            .circleCrop()
            .into(iv_highlight)

        Glide.with(this)
            .load(R.drawable.highlight_1)
            .circleCrop()
            .into(iv_highlight2)

        Glide.with(this)
            .load(R.drawable.feed_1)
            .into(iv_feed1)

        Glide.with(this)
            .load(R.drawable.feed_2)
            .into(iv_feed2)

        Glide.with(this)
            .load(R.drawable.feed_3)
            .centerCrop()
            .into(iv_feed3)
        Glide.with(this)
            .load(R.drawable.feed_4)
            .into(iv_feed4)
        Glide.with(this)
            .load(R.drawable.feed_5)
            .into(iv_feed5)
        Glide.with(this)
            .load(R.drawable.feed_6)
            .into(iv_feed6)
        Glide.with(this)
            .load(R.drawable.feed_7)
            .into(iv_feed7)
        Glide.with(this)
            .load(R.drawable.feed_8)
            .into(iv_feed8)
        Glide.with(this)
            .load(R.drawable.feed_9)
            .into(iv_feed9)
        Glide.with(this)
            .load(R.drawable.feed_10)
            .into(iv_feed10)
        Glide.with(this)
            .load(R.drawable.feed_11)
            .into(iv_feed11)
        Glide.with(this)
            .load(R.drawable.feed_12)
            .into(iv_feed12)
    }
}