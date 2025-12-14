package com.game.grostesk.core;

import com.game.grostesk.systems.CameraSystem;
import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;


public class Main extends SimpleApplication {

    public static void main(String[] args) {

        Main app = new Main();

        AppSettings settings = new AppSettings(true);
        settings.setTitle("Grostesk");
        settings.setResolution(1280, 720);

        app.setSettings(settings);
        app.setShowSettings(false);

        app.start();
    }

    @Override
    public void simpleInitApp() {

        System.out.println("The Forge is lit. The Engine is running.");

        stateManager.attach(new com.game.grostesk.systems.CameraSystem());
        stateManager.attach(new com.game.grostesk.systems.WorldSystem());

        com.jme3.scene.shape.Box boxMesh = new com.jme3.scene.shape.Box(0.5f, 0.5f, 0.5f);
        com.jme3.scene.Geometry boxMesh = new com.jme3.audio(x:)

    }
}
