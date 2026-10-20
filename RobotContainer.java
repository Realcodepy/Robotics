/*    */ package frc.robot;
/*    */ 
/*    */ import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
/*    */ import edu.wpi.first.wpilibj2.command.Command;
/*    */ import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
/*    */ import frc.robot.commands.Drive;
/*    */ import frc.robot.commands.Eject;
/*    */ import frc.robot.commands.ExampleAuto;
/*    */ import frc.robot.commands.Intake;
/*    */ import frc.robot.commands.LaunchSequence;
/*    */ import frc.robot.subsystems.CANDriveSubsystem;
/*    */ import frc.robot.subsystems.CANFuelSubsystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RobotContainer
/*    */ {
/* 29 */   private final CANDriveSubsystem driveSubsystem = new CANDriveSubsystem();
/* 30 */   private final CANFuelSubsystem fuelSubsystem = new CANFuelSubsystem();
/*    */ 
/*    */   
/* 33 */   private final CommandXboxController driverController = new CommandXboxController(0);
/*    */ 
/*    */ 
/*    */   
/* 37 */   private final CommandXboxController operatorController = new CommandXboxController(1);
/*    */ 
/*    */ 
/*    */   
/* 41 */   private final SendableChooser<Command> autoChooser = new SendableChooser();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RobotContainer() {
/* 47 */     configureBindings();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     this.autoChooser.setDefaultOption("Autonomous", new ExampleAuto(this.driveSubsystem, this.fuelSubsystem));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void configureBindings() {
/* 69 */     this.operatorController.leftBumper().whileTrue((Command)new Intake(this.fuelSubsystem));
/*    */ 
/*    */     
/* 72 */     this.operatorController.rightBumper().whileTrue((Command)new LaunchSequence(this.fuelSubsystem));
/*    */ 
/*    */     
/* 75 */     this.operatorController.a().whileTrue((Command)new Eject(this.fuelSubsystem));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 82 */     this.driveSubsystem.setDefaultCommand((Command)new Drive(this.driveSubsystem, this.driverController));
/*    */     
/* 84 */     this.fuelSubsystem.setDefaultCommand(this.fuelSubsystem.run(() -> this.fuelSubsystem.stop()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Command getAutonomousCommand() {
/* 94 */     return (Command)this.autoChooser.getSelected();
/*    */   }
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\RobotContainer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */