package com.example.playvideotest

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.playvideotest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val localMediaController = MediaController(this)

        val uri = Uri.parse("android.resource://$packageName/${R.raw.video}")
//        val uri =
//            Uri.parse("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4")
        val url = Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4")
//        binding.videoView.setVideoURI(uri);
        binding.videoView.setVideoURI(url);

        binding.play.setOnClickListener {
            if (!binding.videoView.isPlaying) {
                binding.videoView.start() // 开始播放
            }
        }
        binding.pause.setOnClickListener {
            if (binding.videoView.isPlaying) {
                binding.videoView.pause() // 暂停播放
            }
        }
        binding.replay.setOnClickListener {
            if (binding.videoView.isPlaying) {
                binding.videoView.resume() // 重新播放
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        binding.videoView.suspend()
    }
}