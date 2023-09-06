package ru.geekbrains.lesson1.store3D.models;

public class Scene {

    //TODO: Доработать в рамках ДР
    private int id;
    private PoligonalModel models;
    private Flash flashes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PoligonalModel getModels() {
        return models;
    }

    public void setModels(PoligonalModel models) {
        this.models = models;
    }

    public Flash getFlashes() {
        return flashes;
    }

    public void setFlashes(Flash flashes) {
        this.flashes = flashes;
    }

    public Scene(PoligonalModel models){
        this.models=models;
    }
    public Scene(PoligonalModel models, Flash flashes){
        this.models=models;
        this.flashes=flashes;
    }
}
