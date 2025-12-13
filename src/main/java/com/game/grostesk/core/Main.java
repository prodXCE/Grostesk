package com.game.grostesk.core;

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

        Box boxMesh = new Box(1, 1, 1);

        Geometry heroGeo = new Geometry("Hero", boxMesh);

        Material heroMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        heroMat.setColor("Color", ColorRGBA.Blue);

        heroGeo.setMaterial(heroMat);

        rootNode.attachChild(heroGeo);

    }
}
