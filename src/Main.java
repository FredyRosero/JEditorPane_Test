/*
 * ¿Que es <JEditorPane> ?
 * 
 * En la documentación oficial de Java (https://docs.oracle.com/javase/8/docs/api/javax/swing/JEditorPane.html) 
 * podemon encontrar la herencia de la clase <JEditorPane>:
 * 
 * 		java.lang.Object 					} -> Código base de Java
 * 				|
 * 				|
 * 				V
 * 		java.awt.Component					}
 * 				|							} -> Paquete <Awt>
 * 				V							}
 * 		java.awt.Container					}
 * 				|
 * 				|
 * 				V
 * 		javax.swing.JComponent				}
 * 				|							}
 * 				V							}
 * 		javax.swing.text.JTextComponent		} -> Paquete <Swing>
 * 				|							}
 * 				V							}
 * 		javax.swing.JEditorPane				}
 *  
 * Así que podemos observar que la clase <JEditorPane> implementa la clase abstracta <JTextComponent> que a su vez,
 * implementa la clase abstracta <JComponent> (del paquete Swing), la cual, extiende la clase <Container> (del paquete Awt).
 * (Más acerca de herencia de clases abstractas: https://emartini.wordpress.com/2008/09/17/poo-clases-abstractas-interfaces-y-herencia-multiple/) 
 * 
 * [1] Acerca del paquete Awt:
 * 	La Abstract Window Toolkit (AWT, en español Kit de Herramientas de Ventana Abstracta) es un kit de 
 * 	herramientas (paquete) de GRÁFICOS, INTERFAZ DE USUARIO (UI en inglés), y sistema de VENTANAS independiente 
 * 	de la plataforma  original de Java. AWT es ahora parte de las Java Foundation Classes (JFC) - la API estándar 
 *  para suministrar una interfaz gráfica de usuario (GUI) para un programa Java.
 * 	En J2SE 1.2, los widgets de AWT fueron ampliamente superados por aquellos del kit de herramientas Swing. 
 * 	Además de proveer un conjunto más rico de widgets UI, Swing dibuja sus propios widgets (usando Java 2D 
 * 	para llamar a las subrutinas de bajo nivel en el subsistema de gráficos local) en lugar de confiar en el 
 * 	módulo de interfaz de usuario de alto nivel del sistema operativo. Swing suministra la opción de usar un aspecto 
 * nativo o de plataforma cruzada para la aplicación.
 * 		https://es.wikipedia.org/wiki/Abstract_Window_Toolkit
 * 
 * [2] Acerca del paquete Swing:
 * 	Swing es una biblioteca (paquete) gráfica para Java. Incluye widgets (controles de interfaz de usuario) 
 * 	para interfaz gráfica de usuario tales como cajas de texto, botones, desplegables y tablas.
 * 		https://es.wikipedia.org/wiki/Swing_(biblioteca_gr%C3%A1fica)
 * 	Swing fue desarrollado para proporcionar un conjunto más sofisticado de componentes GUI que el anterior 
 * 	Window Toolkit (AWT. Swing proporciona una apariencia nativa que emula la apariencia de varias plataformas 
 * 	y también soporta una apariencia que permite que las aplicaciones tengan una apariencia sin relación con la 
 * 	plataforma subyacente. Tiene componentes más potentes y flexibles que AWT. Además de componentes conocidos 
 * 	como botones, casillas de verificación y etiquetas, Swing proporciona varios componentes avanzados como 
 * 	panel con pestañas, paneles de desplazamiento, árboles, tablas y listas. A diferencia de los componentes AWT, 
 * 	los componentes Swing no se implementan mediante código específico de la plataforma (sistema operativo). 
 * 	En cambio, están escritos enteramente en Java y, por lo tanto, son independientes de la plataforma. 
 * 		https://en.wikipedia.org/wiki/Swing_(Java)
 * 
 * [3] Acerca de la clase abstracta <JTextComponent>:
 * 	Es un componente de texto para editar varios tipos de contenido (del paquete Swing).
 * 	Este componente utiliza implementaciones del EditorKit para llevar a cabo su comportamiento. Se transforma 
 * 	efectivamente en el tipo adecuado de editor de texto, para el tipo de contenido que se le da. El tipo de 
 * 	contenido al que el editor está vinculado en un momento determinado es determinado por el EditorKit actualmente
 * 	instalado. Si el contenido se establece en una nueva URL, su tipo se utiliza para determinar el EditorKit que 
 * 	se debe utilizar para cargar el contenido.
 * 	Por defecto, los tipos de contenido conocidos son:
 * 		[4] text/plain
 * 			El texto sin formato, que es el predeterminado, no reconoce el tipo dado. El kit utilizado en este caso 
 * 			es una extensión de DefaultEditorKit que produce una vista de texto plano.
 * 		[5] text/html
 * 			Texto HTML. El kit utilizado en este caso es la clase javax.swing.text.html.HTMLEditorKit que proporciona 
 * 			compatibilidad con HTML 3.2.
 * 		[6] text/rtf
 * 			Texto RTF. El kit utilizado en este caso es la clase javax.swing.text.rtf.RTFEditorKit que proporciona un 
 * 			soporte limitado del formato de texto enriquecido.
 * 	https://docs.oracle.com/javase/8/docs/api/javax/swing/JEditorPane.html 
 * 
 * [7] Acerca de la clase abstracta <JTextComponent>:
 * 	La clase JTextComponent es la base para los componentes de texto del paquete <Swing>. Implemente la clase abstracta
 * 	<JComponent>.
 *  	https://docs.oracle.com/javase/8/docs/api/javax/swing/text/JTextComponent.html
 *  	https://docs.oracle.com/javase/tutorial/uiswing/components/generaltext.html
 *  
 * [8] Acerca de la clase abstracta <JComponent>
 * 	Es la clase base para todos los componentes <Swing>, excepto los contenedores de nivel superior. 
 * 	Para utilizar cualquier componente que hereda de JComponent, se debe colocar dicho componente 
 * 	en una <Jerarquía de contención> cuya raíz es un <Contenedor Swing de nivel superior>. 
 * 	Los contenedores Swing de nivel superior, como JFrame, JDialog y JApplet, son componentes especializados 
 * 	que proporcionan un lugar para que otros componentes Swing se muestren.
 * 		https://docs.oracle.com/javase/8/docs/api/javax/swing/JComponent.html
 * 	La clase <JComponent> extiende la clase <Container> (del paquete Awt), que a su vez extiende <Component> (del paquete Awt).
 * 	La clase <Component> incluye todo desde proporcionar consejos de diseño hasta dar soporte a "pintura" y eventos.
 * 	La clase <Component> tiene la capacidad de agregar o soltar componentes del contenedor <Container>.
 * 		https://docs.oracle.com/javase/tutorial/uiswing/components/jcomponent.html 
 * 
 * [9] Acerca de Jerarquía de contención:
 * 	Para aparecer en la pantalla cada componente GUI debe ser parte un una Jerarquía de contención. Una Jerarquía 
 * 	de contención es: un árbol de compoentes (objetos swing/ instancias de clases swing) que tienen un contenedor 
 * 	top-level (swing) como su raíz. Swing proporciona tres clases de contenedores de top-level generalmente 
 * 	útiles: JFrame, JDialog y JApplet.
 * 	Cada contenedor top-level tiene un <Panel de contenido>
 * 		https://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html
 *
 * [10] Acerca del panel de contenido:
 * 	Cada contenedor de top-level tiene un panel de contenido que, en general, contiene (directa o indirectamente)
 * 	los componentes visibles en la GUI del contenedor de nivel superior.
 * 	El método getContentPane devuelve un objeto <Container>, no un objeto <JComponent>. Esto significa que si 
 * 	desea aprovechar las características de JComponent del panel de contenido, debe especificar el valor de retorno 
 * 	o crear su propio componente para que sea el panel de contenido.
 * 		https://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html
 
*/

// Importar bibliotecas (paquetes)
import java.awt.*; 		//[1]
import javax.swing.*;	//[2]
import java.io.IOException;


public class Main {
	
	public static void main(String[] args) throws IOException {
   	JEditorPane editorPane = null;
    	
        // Crear y configurar la ventana (comoponente top-level) que será la raíz de la Jerarquía de contención [9].
        JFrame frame = new JFrame("TopLevelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Construir un <JPanel>. https://docs.oracle.com/javase/tutorial/uiswing/layout/using.html
        JPanel panelContenido = new JPanel();
        
        //Se define el panel de contenido [10] del componente top-level como el <JPanel> 'panelContenido' 
        frame.setContentPane(panelContenido);
        
        //Se de define el gestor de diseño <LayoutManager> como un <BoxLayout> https://docs.oracle.com/javase/8/docs/api/javax/swing/BoxLayout.html
        panelContenido.setLayout(new BoxLayout(panelContenido, BoxLayout.PAGE_AXIS)); //https://docs.oracle.com/javase/8/docs/api/javax/swing/BoxLayout.html#BoxLayout-java.awt.Container-int-
        
        //Crear JEditorPane
        panelContenido.add( new JLabel("JEditorPane con texto plano") );	        		   
        editorPane = new JEditorPane();
        editorPane.setText("Esto es un texto plano");
        editorPane.setFont( new Font("TimesRoman", Font.ITALIC, 24) );
        editorPane.setForeground( new Color(0,155,0));
        panelContenido.add( editorPane);
        
        //Crear JEditorPane defienedo el tipo de texo. https://docs.oracle.com/javase/7/docs/api/javax/swing/JEditorPane.html#JEditorPane(java.lang.String,%20java.lang.String)
        panelContenido.add( new JLabel("JEditorPane con texto RTF"));
        String rtfString = "{\\rtf1" + 
		        		   "{\\colortbl ;\\red255\\green0\\blue0;}" +
		        		   "Esto\\par " +
		        		   "es una \\b prueba\\b0  de \\i cursiva\\i0\\par " +
		        		   "y \\cf1 todo\\cf0 \\par" + 
		        		   "}";	
        editorPane = new JEditorPane("text/rtf", rtfString);      
        panelContenido.add( editorPane);
        
        //Crear JEditorPane desde recurso web. https://docs.oracle.com/javase/7/docs/api/javax/swing/JEditorPane.html#JEditorPane(java.lang.String)
        panelContenido.add( new JLabel("JEditorPane con texto RTF desde un recusro web"));
        String strUrl_rtf = "ftp://ftp.dante.de/tex-archive/support/rtf2html/Sample.rtf"; 
        editorPane = new JEditorPane(strUrl_rtf);
        panelContenido.add( editorPane);
        
        //Crear JEditorPane desde recurso web. https://docs.oracle.com/javase/7/docs/api/javax/swing/JEditorPane.html#JEditorPane(java.lang.String)    
        panelContenido.add( new JLabel("JEditorPane con texto HTML desde un recurso web") );   
        String strUrl_html = "http://docs.oracle.com/javase/tutorial/uiswing/examples/components/TextSamplerDemoProject/src/components/TextSamplerDemoHelp.html"; 
        editorPane = new JEditorPane(strUrl_html);
        editorPane.setEditable(false);
        editorPane.setPreferredSize(new Dimension(600, 200));
        panelContenido.add( editorPane);
               
        //Mostrar la ventana
        frame.pack();
        frame.setVisible(true);
	}	
}
