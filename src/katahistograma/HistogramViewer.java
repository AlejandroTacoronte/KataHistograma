package katahistograma;

public abstract class HistogramViewer<T> {
    
    private Histogram<T> histogram;

    public HistogramViewer(Histogram<T> histogram) {
        this.histogram = histogram;
    }

    public Histogram<T> getHistogram() {
        return histogram;
    }
    
    abstract public void show();
}
