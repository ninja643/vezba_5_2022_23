package rs.ac.ni.pmf.oop2.figures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FiguresTest
{
    @Test
    public void shouldComputeTriangleArea()
    {
        final Triangle triangle = new Triangle("red", 3, 4, 5);

        assertThat(triangle.area()).isEqualTo(6.0);
    }

    @Test
    public void testFigures()
    {
        Circle circle = new Circle("red", 5.0);
        Figure figureCircle = new Circle("blue", 4);
        Figure figureRectangle = new Rectangle("green", 2, 3);

        printStatistics(circle);
        printStatistics(figureCircle);
        printStatistics(figureRectangle);
    }

    private void printStatistics(Figure figure)
    {
        System.out.println(figure.generateStatistics());

        if (figure instanceof Circle)
        {
            Circle circle = (Circle) figure;
            System.out.println(circle.messageFromCircle());
        }
    }
}