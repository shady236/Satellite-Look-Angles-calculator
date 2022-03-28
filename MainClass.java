import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass 
{
	JFrame appWindow;
	JButton newBtn, aboutBtn, runBtn;
	JRadioButton satLatitudeNorth, satLatitudeSouth, satLongtutdeEast, satLongtutdeWest;
	JRadioButton usrLatitudeNorth, usrLatitudeSouth, usrLongtutdeEast, usrLongtutdeWest;
	ButtonGroup satLatitudeDirection, satLongtutdeDirection, usrLatitudeDirection, usrLongtutdeDirection;
	JTextField satOrbitLabel, satOrbitTextField, satLatitudeTextField, satLatitudeLabel, satLongtutdeTextField, satLongtutdeLabel;
	JTextField usrLatitudeTextField, usrLatitudeLabel, usrLongtutdeTextField, usrLongtutdeLabel;
	JTextField elevationTextField, elevationLabel, azimuthTextField, azimuthLabel, declinationTextField, declinationLabel;
	JTextField distanceTextField, distanceLabel, delayTextField, delayLabel;
	JLabel satOrbit, satLatitude, satLongtutde, usrLatitude, usrLongtutde, elevation, azimuth, declination, distance, delay;
	JLabel appBar, satParametres, usrParametres, input, output, program;
	Border lineBorder = BorderFactory.createLineBorder(Color.GRAY, 2);
	Border padding = new EmptyBorder(0, 4, 0, 0), largePadding = new EmptyBorder(20, 20, 20, 20);
	CompoundBorder lineBorderWithPadding = new CompoundBorder(lineBorder, padding);
	CompoundBorder lineBorderWithLargePadding = new CompoundBorder(lineBorder, padding);
	
	public static void main(String[] args)
	{
		new MainClass().startApp();
	}  // end of main() function
	
	public void startApp()
	{
		/* start creating new button in App bar */
		newBtn = new JButton("New");
		newBtn.setVisible(true);
		newBtn.setHorizontalAlignment(JButton.CENTER);
		newBtn.setVerticalAlignment(JButton.CENTER);
		newBtn.setPreferredSize(new Dimension(60, 40));
		newBtn.setForeground(Color.WHITE);
		newBtn.setBackground(Color.DARK_GRAY);
		newBtn.setOpaque(true);
		newBtn.setBorder(null);
		newBtn.addActionListener(e -> actionHandler(e));
		newBtn.setFocusable(false);
		/* end of creating new button in App bar */
		
		/* start creating About this program button in App bar */
		aboutBtn = new JButton("About this program");
		aboutBtn.setVisible(true);
		aboutBtn.setHorizontalAlignment(JButton.CENTER);
		aboutBtn.setVerticalAlignment(JButton.CENTER);
		aboutBtn.setPreferredSize(new Dimension(150, 40));
		aboutBtn.setForeground(Color.WHITE);
		aboutBtn.setBackground(Color.DARK_GRAY);
		aboutBtn.setOpaque(true);
		aboutBtn.setBorder(null);
		aboutBtn.addActionListener(e -> actionHandler(e));
		aboutBtn.setFocusable(false);
		/* end of creating About this program button in App bar */
		
		/* start creating App bar */
		appBar = new JLabel();
		appBar.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		appBar.setHorizontalAlignment(JLabel.CENTER);
		appBar.setVerticalAlignment(JLabel.CENTER);
		appBar.setPreferredSize(new Dimension(200, 40));
		appBar.setBackground(Color.DARK_GRAY);
		appBar.setForeground(Color.WHITE);
		appBar.setOpaque(true);
		appBar.add(newBtn);
		appBar.add(aboutBtn);
		/* end of creating App bar */
		
		
		
		/* start creating label for Satellite Orbit */
		satOrbitLabel = new JTextField("Satellite Orbit");
		satOrbitLabel.setVisible(true);
		satOrbitLabel.setHorizontalAlignment(JTextField.LEFT);
		satOrbitLabel.setPreferredSize(new Dimension(100, 25));
		satOrbitLabel.setEditable(false);
		satOrbitLabel.setBorder(null);
		/* end of creating label for Satellite Orbit */
		
		/* start creating text box for Satellite Orbit */
		satOrbitTextField = new JTextField("Geostasionary");
		satOrbitTextField.setVisible(true);
		satOrbitTextField.setBackground(Color.LIGHT_GRAY);
		satOrbitTextField.setHorizontalAlignment(JTextField.LEFT);
		satOrbitTextField.setPreferredSize(new Dimension(155, 25));
		satOrbitTextField.setEditable(false);
		satOrbitTextField.setBorder(lineBorderWithPadding);
		/* end of creating text box for Satellite Orbit */
		
		/* start merging label of Satellite Orbit with the Satellite Orbit text box in one container */
		satOrbit = new JLabel();
		satOrbit.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		satOrbit.setHorizontalAlignment(JLabel.CENTER);
		satOrbit.setVerticalAlignment(JLabel.CENTER);
		satOrbit.add(satOrbitLabel);
		satOrbit.add(satOrbitTextField);
		/* end of merging label of Satellite Orbit with the Satellite Orbit text box in one container */
		
		
		
		/* start creating label for Satellite latitude */
		satLatitudeLabel = new JTextField("Satellite latitude");
		satLatitudeLabel.setHorizontalAlignment(JTextField.LEFT);
		satLatitudeLabel.setPreferredSize(new Dimension(100, 25));
		satLatitudeLabel.setEditable(false);
		satLatitudeLabel.setBorder(null);
		satLatitudeLabel.setVisible(true);
		/* end of creating label for Satellite latitude */
		
		/* start creating text box for Satellite latitude */
		satLatitudeTextField = new JTextField("0");
		satLatitudeTextField.setHorizontalAlignment(JTextField.LEFT);
		satLatitudeTextField.setPreferredSize(new Dimension(60, 25));
		satLatitudeTextField.setBackground(Color.LIGHT_GRAY);
		satLatitudeTextField.setEditable(false);
		satLatitudeTextField.setBorder(lineBorderWithPadding);
		satLatitudeTextField.setVisible(true);
		/* end of creating text box for Satellite latitude */
		
		/* start creating radio button to be checked if Satellite latitude is in North os eauator */
		satLatitudeNorth = new JRadioButton("N", null, true);
		satLatitudeNorth.setHorizontalAlignment(JTextField.LEFT);
		satLatitudeNorth.setPreferredSize(new Dimension(40, 25));
		satLatitudeNorth.setFocusable(false);
		satLatitudeNorth.setVisible(true);
		/* end of creating radio button to be checked if Satellite latitude is in North of eauator */
		
		/* start creating radio button to be checked if Satellite latitude is in South of eauator */
		satLatitudeSouth = new JRadioButton("S ", null, false);
		satLatitudeSouth.setHorizontalAlignment(JTextField.RIGHT);
		satLatitudeSouth.setPreferredSize(new Dimension(40, 25));
		satLatitudeSouth.setFocusable(false);
		satLatitudeSouth.setVisible(true);
		/* end of creating radio button to be checked if Satellite latitude is in South os eauator */
		
		/* start merging North radio button of Satellite latitude with the South radio button in one container */
		satLatitudeDirection = new ButtonGroup();
		satLatitudeDirection.add(satLatitudeNorth);
		satLatitudeDirection.add(satLatitudeSouth);
		/* end of merging North radio button of Satellite latitude with the South radio button in one container */
		
		/* start merging all Satellite latitude parameters in one container */
		satLatitude = new JLabel();
		satLatitude.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		satLatitude.setHorizontalAlignment(JLabel.CENTER);
		satLatitude.setVerticalAlignment(JLabel.CENTER);
		satLatitude.add(satLatitudeLabel);
		satLatitude.add(satLatitudeTextField);
		satLatitude.add(satLatitudeNorth);
		satLatitude.add(satLatitudeSouth);
		/* end of merging all Satellite latitude parameters in one container */
		
		
		
		
		/* start creating label for Satellite longtutde */
		satLongtutdeLabel = new JTextField("Satellite longtutde");
		satLongtutdeLabel.setHorizontalAlignment(JTextField.LEFT);
		satLongtutdeLabel.setPreferredSize(new Dimension(100, 25));
		satLongtutdeLabel.setEditable(false);
		satLongtutdeLabel.setBorder(null);
		satLongtutdeLabel.setVisible(true);
		/* end of creating label for Satellite longtutde */
		
		/* start creating text box for Satellite longtutde */
		satLongtutdeTextField = new JTextField();
		satLongtutdeTextField.setHorizontalAlignment(JTextField.LEFT);
		satLongtutdeTextField.setPreferredSize(new Dimension(60, 25));
		satLongtutdeTextField.setBackground(Color.WHITE);
		satLongtutdeTextField.setBorder(lineBorderWithPadding);
		satLongtutdeTextField.setVisible(true);
		/* end of creating text box for Satellite longtutde */
		
		/* start creating radio button to be checked if Satellite longtutde is in East of Greenwich */
		satLongtutdeEast = new JRadioButton("E", null, true);
		satLongtutdeEast.setHorizontalAlignment(JTextField.LEFT);
		satLongtutdeEast.setPreferredSize(new Dimension(40, 25));
		satLongtutdeEast.setFocusable(false);
		satLongtutdeEast.setVisible(true);
		/* end of creating radio button to be checked if Satellite longtutde is in East of Greenwich */
		
		/* start creating radio button to be checked if Satellite longtutde is in West of Greenwich */
		satLongtutdeWest = new JRadioButton("W", null, false);
		satLongtutdeWest.setHorizontalAlignment(JTextField.RIGHT);
		satLongtutdeWest.setPreferredSize(new Dimension(40, 25));
		satLongtutdeWest.setFocusable(false);
		satLongtutdeWest.setVisible(true);
		/* end of creating radio button to be checked if Satellite longtutde is in West of Greenwich */
		
		/* start merging East radio button of Satellite longtutde with the West radio button in one container */
		satLongtutdeDirection = new ButtonGroup();
		satLongtutdeDirection.add(satLongtutdeEast);
		satLongtutdeDirection.add(satLongtutdeWest);
		/* end of merging North radio button of Satellite longtutde with the South radio button in one container */
		
		/* start merging all Satellite longtutde parameters in one container */
		satLongtutde = new JLabel();
		satLongtutde.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		satLongtutde.setHorizontalAlignment(JLabel.CENTER);
		satLongtutde.setVerticalAlignment(JLabel.CENTER);
		satLongtutde.add(satLongtutdeLabel);
		satLongtutde.add(satLongtutdeTextField);
		satLongtutde.add(satLongtutdeEast);
		satLongtutde.add(satLongtutdeWest);
		/* end of merging all Satellite longtutde parameters in one container */
		
		
		
		
		
		/* start merging all Satellite parameters in one container */
		satParametres = new JLabel();
		satParametres.setLayout(new GridLayout(4, 1, 0, 0));
		satParametres.setText("Satellite parameters");
		satParametres.setHorizontalAlignment(JLabel.CENTER);
		satParametres.setVerticalAlignment(JLabel.TOP);
		satParametres.setBorder(lineBorderWithLargePadding);
		satParametres.add(new JLabel());
		satParametres.add(satOrbit);
		satParametres.add(satLatitude);
		satParametres.add(satLongtutde);
		/* end of merging all Satellite parameters in one container */
		
		
		
		
		
		
		
		
		
		
		/* start creating label for user latitude */
		usrLatitudeLabel = new JTextField("user latitude");
		usrLatitudeLabel.setHorizontalAlignment(JTextField.LEFT);
		usrLatitudeLabel.setPreferredSize(new Dimension(100, 25));
		usrLatitudeLabel.setEditable(false);
		usrLatitudeLabel.setBorder(null);
		usrLatitudeLabel.setVisible(true);
		/* end of creating label for user latitude */
		
		/* start creating text box for user latitude */
		usrLatitudeTextField = new JTextField();
		usrLatitudeTextField.setHorizontalAlignment(JTextField.LEFT);
		usrLatitudeTextField.setPreferredSize(new Dimension(60, 25));
		usrLatitudeTextField.setBackground(Color.WHITE);
		usrLatitudeTextField.setBorder(lineBorderWithPadding);
		usrLatitudeTextField.setVisible(true);
		/* end of creating text box for user latitude */
		
		/* start creating radio button to be checked if user latitude is in North os eauator */
		usrLatitudeNorth = new JRadioButton("N", null, true);
		usrLatitudeNorth.setHorizontalAlignment(JTextField.LEFT);
		usrLatitudeNorth.setPreferredSize(new Dimension(40, 25));
		usrLatitudeNorth.setFocusable(false);
		usrLatitudeNorth.setVisible(true);
		/* end of creating radio button to be checked if user latitude is in North of eauator */
		
		/* start creating radio button to be checked if user latitude is in South of eauator */
		usrLatitudeSouth = new JRadioButton("S ", null, false);
		usrLatitudeSouth.setHorizontalAlignment(JTextField.RIGHT);
		usrLatitudeSouth.setPreferredSize(new Dimension(40, 25));
		usrLatitudeSouth.setFocusable(false);
		usrLatitudeSouth.setVisible(true);
		/* end of creating radio button to be checked if user latitude is in South os eauator */
		
		/* start merging North radio button of user latitude with the South radio button in one container */
		usrLatitudeDirection = new ButtonGroup();
		usrLatitudeDirection.add(usrLatitudeNorth);
		usrLatitudeDirection.add(usrLatitudeSouth);
		/* end of merging North radio button of user latitude with the South radio button in one container */
		
		/* start merging all user latitude parameters in one container */
		usrLatitude = new JLabel();
		usrLatitude.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		usrLatitude.setHorizontalAlignment(JLabel.CENTER);
		usrLatitude.setVerticalAlignment(JLabel.CENTER);
		usrLatitude.add(usrLatitudeLabel);
		usrLatitude.add(usrLatitudeTextField);
		usrLatitude.add(usrLatitudeNorth);
		usrLatitude.add(usrLatitudeSouth);
		/* end of merging all user latitude parameters in one container */
		
		
		
		
		/* start creating label for user longtutde */
		usrLongtutdeLabel = new JTextField("user longtutde");
		usrLongtutdeLabel.setHorizontalAlignment(JTextField.LEFT);
		usrLongtutdeLabel.setPreferredSize(new Dimension(100, 25));
		usrLongtutdeLabel.setEditable(false);
		usrLongtutdeLabel.setBorder(null);
		usrLongtutdeLabel.setVisible(true);
		/* end of creating label for user longtutde */
		
		/* start creating text box for user longtutde */
		usrLongtutdeTextField = new JTextField();
		usrLongtutdeTextField.setHorizontalAlignment(JTextField.LEFT);
		usrLongtutdeTextField.setPreferredSize(new Dimension(60, 25));
		usrLongtutdeTextField.setBackground(Color.WHITE);
		usrLongtutdeTextField.setBorder(lineBorderWithPadding);
		usrLongtutdeTextField.setVisible(true);
		/* end of creating text box for user longtutde */
		
		/* start creating radio button to be checked if user longtutde is in East of Greenwich */
		usrLongtutdeEast = new JRadioButton("E", null, true);
		usrLongtutdeEast.setHorizontalAlignment(JTextField.LEFT);
		usrLongtutdeEast.setPreferredSize(new Dimension(40, 25));
		usrLongtutdeEast.setFocusable(false);
		usrLongtutdeEast.setVisible(true);
		/* end of creating radio button to be checked if user longtutde is in East of Greenwich */
		
		/* start creating radio button to be checked if user longtutde is in West of Greenwich */
		usrLongtutdeWest = new JRadioButton("W", null, false);
		usrLongtutdeWest.setHorizontalAlignment(JTextField.RIGHT);
		usrLongtutdeWest.setPreferredSize(new Dimension(40, 25));
		usrLongtutdeWest.setFocusable(false);
		usrLongtutdeWest.setVisible(true);
		/* end of creating radio button to be checked if user longtutde is in West of Greenwich */
		
		/* start merging East radio button of user longtutde with the West radio button in one container */
		usrLongtutdeDirection = new ButtonGroup();
		usrLongtutdeDirection.add(usrLongtutdeEast);
		usrLongtutdeDirection.add(usrLongtutdeWest);
		/* end of merging North radio button of user longtutde with the South radio button in one container */
		
		/* start merging all user longtutde parameters in one container */
		usrLongtutde = new JLabel();
		usrLongtutde.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		usrLongtutde.setHorizontalAlignment(JLabel.CENTER);
		usrLongtutde.setVerticalAlignment(JLabel.CENTER);
		usrLongtutde.add(usrLongtutdeLabel);
		usrLongtutde.add(usrLongtutdeTextField);
		usrLongtutde.add(usrLongtutdeEast);
		usrLongtutde.add(usrLongtutdeWest);
		/* end of merging all user longtutde parameters in one container */
		
		
		
		
		
		/* start merging all user parameters in one container */
		usrParametres = new JLabel();
		usrParametres.setLayout(new GridLayout(4, 1, 0, 0));
		usrParametres.setText("user Location");
		usrParametres.setHorizontalAlignment(JLabel.CENTER);
		usrParametres.setVerticalAlignment(JLabel.TOP);
		usrParametres.setBorder(lineBorderWithLargePadding);
		usrParametres.add(new JLabel());
		usrParametres.add(new JLabel());
		usrParametres.add(usrLatitude);
		usrParametres.add(usrLongtutde);
		/* end of merging all user parameters in one container */
		
		
		
		
		
		
		
		/* start merging all satellite parameters with all user parameters in one container */
		input = new JLabel();
		input.setLayout(new GridLayout(1, 2, 5, 5));
		input.add(satParametres);
		input.add(usrParametres);
		/* end of merging all satellite parameters with all user parameters in one container */
		/* end of creating input container */
		
		
		
		
		
		
		
		
		
		/* start creating label for Elevation angle */
		elevationLabel = new JTextField("Elevation angle (degree)");
		elevationLabel.setVisible(true);
		elevationLabel.setHorizontalAlignment(JTextField.LEFT);
		elevationLabel.setPreferredSize(new Dimension(170, 25));
		elevationLabel.setEditable(false);
		elevationLabel.setBorder(null);
		/* end of creating label for Elevation angle */
		
		/* start creating text box for Elevation angle */
		elevationTextField = new JTextField();
		elevationTextField.setVisible(true);
		elevationTextField.setBackground(Color.LIGHT_GRAY);
		elevationTextField.setHorizontalAlignment(JTextField.LEFT);
		elevationTextField.setPreferredSize(new Dimension(220, 25));
		elevationTextField.setEditable(false);
		elevationTextField.setBorder(lineBorderWithPadding);
		/* end of creating text box for Elevation angle */
		
		/* start merging label of Elevation angle with the Elevation angle text box in one container */
		elevation = new JLabel();
		elevation.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		elevation.setHorizontalAlignment(JLabel.CENTER);
		elevation.setVerticalAlignment(JLabel.CENTER);
		elevation.add(elevationLabel);
		elevation.add(elevationTextField);
		/* end of merging label of Elevation angle with the Elevation angle text box in one container */
		
		
		
		
		
		/* start creating label for Azimuth angle */
		azimuthLabel = new JTextField("Azimuth angle (degree)");
		azimuthLabel.setVisible(true);
		azimuthLabel.setHorizontalAlignment(JTextField.LEFT);
		azimuthLabel.setPreferredSize(new Dimension(170, 25));
		azimuthLabel.setEditable(false);
		azimuthLabel.setBorder(null);
		/* end of creating label for Azimuth angle */
		
		/* start creating text box for Azimuth angle */
		azimuthTextField = new JTextField();
		azimuthTextField.setVisible(true);
		azimuthTextField.setBackground(Color.LIGHT_GRAY);
		azimuthTextField.setHorizontalAlignment(JTextField.LEFT);
		azimuthTextField.setPreferredSize(new Dimension(220, 25));
		azimuthTextField.setEditable(false);
		azimuthTextField.setBorder(lineBorderWithPadding);
		/* end of creating text box for Azimuth angle */
		
		/* start merging label of Azimuth angle with the Azimuth angle text box in one container */
		azimuth = new JLabel();
		azimuth.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		azimuth.setHorizontalAlignment(JLabel.CENTER);
		azimuth.setVerticalAlignment(JLabel.CENTER);
		azimuth.add(azimuthLabel);
		azimuth.add(azimuthTextField);
		/* end of merging label of Azimuth angle with the Azimuth angle text box in one container */
		
		
		
		
		/* start creating label for Declination angle */
		declinationLabel = new JTextField("Declination angle (degree)");
		declinationLabel.setVisible(true);
		declinationLabel.setHorizontalAlignment(JTextField.LEFT);
		declinationLabel.setPreferredSize(new Dimension(170, 25));
		declinationLabel.setEditable(false);
		declinationLabel.setBorder(null);
		/* end of creating label for Declination angle */
		
		/* start creating text box for Declination angle */
		declinationTextField = new JTextField();
		declinationTextField.setVisible(true);
		declinationTextField.setBackground(Color.LIGHT_GRAY);
		declinationTextField.setHorizontalAlignment(JTextField.LEFT);
		declinationTextField.setPreferredSize(new Dimension(220, 25));
		declinationTextField.setEditable(false);
		declinationTextField.setBorder(lineBorderWithPadding);
		/* end of creating text box for Declination angle */
		
		/* start merging label of Declination angle with the Declination angle text box in one container */
		declination = new JLabel();
		declination.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		declination.setHorizontalAlignment(JLabel.CENTER);
		declination.setVerticalAlignment(JLabel.CENTER);
		declination.add(declinationLabel);
		declination.add(declinationTextField);
		/* end of merging label of Declination angle with the Declination angle text box in one container */
		
		
		
		
		/* start creating label for Distance to satellite */
		distanceLabel = new JTextField("Distance to satellite (km)");
		distanceLabel.setVisible(true);
		distanceLabel.setHorizontalAlignment(JTextField.LEFT);
		distanceLabel.setPreferredSize(new Dimension(170, 25));
		distanceLabel.setEditable(false);
		distanceLabel.setBorder(null);
		/* end of creating label for Distance to satellite */
		
		/* start creating text box for Distance to satellite */
		distanceTextField = new JTextField();
		distanceTextField.setVisible(true);
		distanceTextField.setBackground(Color.LIGHT_GRAY);
		distanceTextField.setHorizontalAlignment(JTextField.LEFT);
		distanceTextField.setPreferredSize(new Dimension(220, 25));
		distanceTextField.setEditable(false);
		distanceTextField.setBorder(lineBorderWithPadding);
		/* end of creating text box for Distance to satellite */
		
		/* start merging label of Distance to satellite with the Distance to satellite text box in one container */
		distance = new JLabel();
		distance.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		distance.setHorizontalAlignment(JLabel.CENTER);
		distance.setVerticalAlignment(JLabel.CENTER);
		distance.add(distanceLabel);
		distance.add(distanceTextField);
		/* end of merging label of Distance to satellite with the Distance to satellite text box in one container */
		
		
		
		
		/* start creating label for Round-Trip signal delay */
		delayLabel = new JTextField("Round-Trip signal delay (sec)");
		delayLabel.setVisible(true);
		delayLabel.setHorizontalAlignment(JTextField.LEFT);
		delayLabel.setPreferredSize(new Dimension(170, 25));
		delayLabel.setEditable(false);
		delayLabel.setBorder(null);
		/* end of creating label for Round-Trip signal delay */
		
		/* start creating text box for Round-Trip signal delay */
		delayTextField = new JTextField();
		delayTextField.setVisible(true);
		delayTextField.setBackground(Color.LIGHT_GRAY);
		delayTextField.setHorizontalAlignment(JTextField.LEFT);
		delayTextField.setPreferredSize(new Dimension(220, 25));
		delayTextField.setEditable(false);
		delayTextField.setBorder(lineBorderWithPadding);
		/* end of creating text box for Round-Trip signal delay */
		
		/* start merging label of Round-Trip signal delay with the Round-Trip signal delay text box in one container */
		delay = new JLabel();
		delay.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 0));
		delay.setHorizontalAlignment(JLabel.CENTER);
		delay.setVerticalAlignment(JLabel.CENTER);
		delay.add(delayLabel);
		delay.add(delayTextField);
		/* end of merging label of Round-Trip signal delay with the Round-Trip signal delay text box in one container */
		
		
		
		
		
		
		
		
		
		
		
		/* start merging all output in one container */
		output = new JLabel();
		output.setLayout(new GridLayout(6, 0, 0, 0));
		output.setText("output");
		output.setHorizontalAlignment(JLabel.CENTER);
		output.setVerticalAlignment(JLabel.TOP);
		output.setBorder(lineBorderWithLargePadding);
		output.add(new JLabel());
		output.add(elevation);
		output.add(azimuth);
		output.add(declination);
		output.add(distance);
		output.add(delay);
		/* end of merging all output in one container */
		/* end of creating input container */
		
		
		
		
		
		
		
		
		
		/* start merging all input with all output in one container */
		program = new JLabel();
		program.setLayout(new GridLayout(2, 1, 5, 20));
		program.setHorizontalAlignment(JLabel.LEFT);
		program.setVerticalAlignment(JLabel.CENTER);
		program.setBackground(new Color(240, 240, 240));
		program.setForeground(Color.BLACK);
		program.setOpaque(true);
		program.add(input);
		program.add(output);
		/* end of merging all input with all output in one container */
		
		
		
		
		
		/* start of creating run button */
		runBtn = new JButton("Run");
		runBtn.setVisible(true);
		runBtn.setHorizontalAlignment(JButton.CENTER);
		runBtn.setVerticalAlignment(JButton.CENTER);
		runBtn.setPreferredSize(new Dimension(150, 50));
		runBtn.setFont(new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 25));
		runBtn.setForeground(Color.WHITE);
		runBtn.setBackground(Color.DARK_GRAY);
		runBtn.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		runBtn.addActionListener(e -> actionHandler(e));
		runBtn.setFocusable(false);
		/* end of of creating run button */
		
		
		/* start adding app bar, run button and program container to the application window */
		appWindow = new JFrame();
		appWindow.setLayout(new BorderLayout(0, 10));
		appWindow.add(appBar, BorderLayout.NORTH);
		appWindow.add(runBtn, BorderLayout.SOUTH);
		appWindow.add(new JPanel(), BorderLayout.EAST);  // add right padding in the application window
		appWindow.add(new JPanel(), BorderLayout.WEST);  // add left  padding in the application window
		appWindow.add(program, BorderLayout.CENTER);
		appWindow.setSize(600, 600);
		appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appWindow.setVisible(true);
		/* end of adding app bar, run button and program container to the application window */
	}

	
	public void actionHandler(ActionEvent e) 
	{
		if(e.getSource() == aboutBtn)
		{
			System.out.println("about btn clicked");
			int response = JOptionPane.showOptionDialog(
				appWindow, 
				"This program is used to calculate \n" + 
			     "   - Elevation Angle for user antenna to point to a specific satellie, \n" + 
			     "   - Azimuth Angle for user antenna to point to the satellie, \n" + 
			     "   - Diclination Angle for user antenna to point to the satellie, \n" + 
			     "   - Distanse between the user and the satellie \n" + 
			     "   - and Time delay that the signal takes to go from user to satellite", 
		          
			     "About This Program", 
			     JOptionPane.YES_OPTION, 
			     JOptionPane.INFORMATION_MESSAGE, 
			     null, 
			     new String[] {"How to use"}, 
			     0
			);
			
			if(response == 0)
			{
				JOptionPane.showMessageDialog(appWindow, "Please Input Satellite parameters & user locaion all in degress, then press Run \n", "How to use", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(e.getSource() == runBtn)
		{
			calculateOutput();
		}
		else if(e.getSource() == newBtn)
		{
			satLongtutdeTextField.setText("");
			usrLongtutdeTextField.setText("");
			usrLatitudeTextField.setText("");
			elevationTextField.setText("");
			azimuthTextField.setText("");
			declinationTextField.setText("");
			distanceTextField.setText("");
			delayTextField.setText("");
			satLongtutdeEast.setSelected(true);
			satLatitudeNorth.setSelected(true);
			usrLongtutdeEast.setSelected(true);
			usrLatitudeNorth.setSelected(true);
			
		}
	}  // end of actionHandler() function
	
	
	public void calculateOutput()
	{
		double phi_ss_radian;
		double phi_e_radian ;
		double lmda_e_radian;
		
		/* try to get user input */
		try 
		{
			phi_ss_radian = Math.toRadians( Double.parseDouble(satLongtutdeTextField.getText()) );
			phi_e_radian  = Math.toRadians( Double.parseDouble(usrLongtutdeTextField.getText()) );
			lmda_e_radian = Math.toRadians( Double.parseDouble(usrLatitudeTextField.getText()) );
			
			/* South & West are considered as negative */
			if(satLongtutdeWest.isSelected())			phi_ss_radian *= -1;
			if(usrLongtutdeWest.isSelected())			phi_e_radian  *= -1;
			if(usrLatitudeSouth.isSelected())			lmda_e_radian *= -1;
			
			/* calculate output */
			double B_radian  = phi_e_radian - phi_ss_radian;
			double b_radian  = Math.acos( Math.cos(B_radian) * Math.cos(lmda_e_radian) );
			double A_radian  = Math.asin( Math.sin( Math.abs(B_radian) ) / Math.sin(b_radian) );
			double d_km      = Math.sqrt( Math.pow(6371, 2) + Math.pow(42164, 2) - 2*6371*42164*Math.cos(b_radian) );
			double El_radian = Math.acos( 42164/d_km *Math.sin(b_radian) );
			
			double Az_radian = 0;
			if(lmda_e_radian<=0 && B_radian<=0)			Az_radian = A_radian;
			else if(lmda_e_radian<=0 && B_radian>=0)		Az_radian = 2*Math.PI - A_radian;
			else if(lmda_e_radian>=0 && B_radian<=0)		Az_radian = Math.PI - A_radian;
			else if(lmda_e_radian>=0 && B_radian>=0)		Az_radian = Math.PI + A_radian;
			
			double d0_km  = Math.sqrt( Math.pow(6371, 2) + Math.pow(42164, 2) - 2*6371*42164*Math.cos(lmda_e_radian) );
			double declination_radian = Math.PI/2 - lmda_e_radian ;
			declination_radian -=  Math.acos( 42164/d0_km *Math.sin(lmda_e_radian) );
			double delay_sec = d_km/300000;
			/* end of calculations */
			
			/* display results */
			azimuthTextField.setText( Double.toString( Math.toDegrees(Az_radian)) );
			elevationTextField.setText( Double.toString( Math.toDegrees(El_radian)) );
			declinationTextField.setText( Double.toString( Math.toDegrees(declination_radian)) );
			distanceTextField.setText( Double.toString(d_km) );
			delayTextField.setText( Double.toString(delay_sec) );
		} 
		catch (Exception e)  // if the input format is wrong or missed, print how to use message
		{
			JOptionPane.showMessageDialog(appWindow, "Please Input Satellite parameters & user locaion all in degress, then press Run \n", "How to use", JOptionPane.WARNING_MESSAGE);
		}
		
		
	}  // end of calculateOutput() function
	
	
	
}  // end of class MainClass