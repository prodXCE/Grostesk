package com.game.grostesk.systems;

import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.BaseAppState;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Quad;

public class WorldSystem extends BaseAppState {

    private SimpleApplication app;
    private Node rootNode;

    private Node worldNode = new Node("WorldNode");

    @Override
    protected void initialize(Application app) {
        this.app = (SimpleApplication) app;
        this.rootNode = this.app.getRootNode();

        Quad floorMesh = new Quad(100, 100);

        Geometry floorGeo = new Geometry("DungeonFloor", floorMesh);

        Material floorMat = new Material(app.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
        floorMat.setColor("Color", ColorRGBA.DarkGray);
        floorGeo.setMaterial(floorMat);

        Quaternion rot = new Quaternion();
        rot.fromAngleAxis(-FastMath.HALF_PI, Vector3f.UNIT_X);
        floorGeo.setLocalRotation(rot);

        floorGeo.setLocalTranslation(-50, 0, 50);

        worldNode.attachChild(floorGeo);
        rootNode.attachChild(worldNode);
    }

    @Override
    protected void cleanup(Application app) {
        rootNode.detachChild(worldNode);
    }

    @Override
    protected void onEnable() {}

    @Override
    protected void onDisable() {}
}