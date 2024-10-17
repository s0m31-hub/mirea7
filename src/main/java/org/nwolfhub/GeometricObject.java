package org.nwolfhub;

public abstract class GeometricObject implements Comparable, Colorable {
    private String color = "белый";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Создает по умолчанию заданный геометрический объект */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Создает геометрический объект с указанным цветом и заливкой */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Возвращает цвет */
    public String getColor() {
        return color;
    }

    /** Присваивает новый цвет */
    public void setColor(String color) {
        this.color = color;
    }

    /** Возвращает заливку. Поскольку filled типа boolean,
     *  getter-метод называется isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Присваивает новую заливку */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Получает dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Возвращает строковое представление этого объекта */
    public String toString() {
        return "создан " + dateCreated + ",\nцвет: " + color +
                ", заливка: " + filled;
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
    public static int max(GeometricObject g1, GeometricObject g2){
        return (g1.compareTo(g2));
    }

    //interface doesn't provide it tho???
//    public static GeometricObject max(GeometricObject g1, GeometricObject g2) throws IllegalAccessException {
//        throw new IllegalAccessException("Do not call superclass method");
//    }

    @Override
    public void howToColor() {
        //???
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}