package com.example.herdzik.coloredcubewallpaper;

import android.opengl.GLSurfaceView.Renderer;
public class LessonThreeWallpaperService extends OpenGLES2WallpaperService {
    @Override
    Renderer getNewRenderer() {
        return new LessonThreeRenderer();
    }
}