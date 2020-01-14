project(fdkaac-audioencoder)
cmake_minimum_required(VERSION 3.4.1)

#ffmpeg头文件
include_directories(3rdparty/ffmpeg/include)

add_library(audioencoder SHARED
        audio_encoder.cpp
        AudioEncoder.cpp)

set(PATH_TO_PRE_BUILT ${CMAKE_CURRENT_SOURCE_DIR}/3rdparty/prebuilt/armv7-a)
target_link_libraries(audioencoder
        # 引入系统的动态库
        log
        android
        z
        #引入ffmpeg相关静态库
        ${PATH_TO_PRE_BUILT}/libavfilter.a
        ${PATH_TO_PRE_BUILT}/libavformat.a
        ${PATH_TO_PRE_BUILT}/libavcodec.a
        ${PATH_TO_PRE_BUILT}/libpostproc.a
        ${PATH_TO_PRE_BUILT}/libswresample.a
        ${PATH_TO_PRE_BUILT}/libswscale.a
        ${PATH_TO_PRE_BUILT}/libavutil.a
        ${PATH_TO_PRE_BUILT}/libvo-aacenc.a
        ${PATH_TO_PRE_BUILT}/libx264.a
        ${PATH_TO_PRE_BUILT}/libfdk-aac.a
        )