import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

public class DomParserSchema {
    public static void main(String[] args) {
        try {
            // Create a new File object for the XML file
            File inputFile = new File("input.xml");

            // Create a new DocumentBuilderFactory
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            // Set the validation feature to true
            dbFactory.setValidating(true);

            // Create a new DocumentBuilder
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // Set an error handler to handle validation errors
            dBuilder.setErrorHandler(new XmlErrorHandler());

            // Parse the XML file into a Document object
            Document doc = dBuilder.parse(inputFile);

            // Normalize the document
            doc.getDocumentElement().normalize();

            // Get the root element of the document
            Element root = doc.getDocumentElement();

            // Get a list of all Circle elements in the document
            NodeList circleList = root.getElementsByTagName("Circle");

            // Loop through the list of Circle elements
            for (int i = 0; i < circleList.getLength(); i++) {
                // Get the i-th Circle element
                Node circleNode = circleList.item(i);

                // If the Circle element is an Element node
                if (circleNode.getNodeType() == Node.ELEMENT_NODE) {
                    // Cast the Circle node to an Element
                    Element circleElement = (Element) circleNode;

                    // Get the Radius element of the Circle
                    Element radiusElement = (Element) circleElement.getElementsByTagName("Radius").item(0);

                    // Get the value of the Radius element
                    String radiusValue = radiusElement.getTextContent();

                    // Print the Radius value
                    System.out.println("Circle " + i + " has radius " + radiusValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
