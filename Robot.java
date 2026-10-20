/*     */ package frc.robot;
/*     */ 
/*     */ import edu.wpi.first.hal.HAL;
/*     */ import edu.wpi.first.wpilibj.TimedRobot;
/*     */ import edu.wpi.first.wpilibj2.command.Command;
/*     */ import edu.wpi.first.wpilibj2.command.CommandScheduler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Robot
/*     */   extends TimedRobot
/*     */ {
/*     */   private Command m_autonomousCommand;
/*     */   private RobotContainer m_robotContainer;
/*     */   
/*     */   public void robotInit() {
/*  37 */     this.m_robotContainer = new RobotContainer();
/*     */ 
/*     */     
/*  40 */     HAL.report(22, 10);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void robotPeriodic() {
/*  62 */     CommandScheduler.getInstance().run();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void disabledInit() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void disabledPeriodic() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void autonomousInit() {
/*  80 */     this.m_autonomousCommand = this.m_robotContainer.getAutonomousCommand();
/*     */ 
/*     */     
/*  83 */     if (this.m_autonomousCommand != null) {
/*  84 */       CommandScheduler.getInstance().schedule(new Command[] { this.m_autonomousCommand });
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void autonomousPeriodic() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void teleopInit() {
/*  99 */     if (this.m_autonomousCommand != null) {
/* 100 */       this.m_autonomousCommand.cancel();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void teleopPeriodic() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void testInit() {
/* 112 */     CommandScheduler.getInstance().cancelAll();
/*     */   }
/*     */   
/*     */   public void testPeriodic() {}
/*     */   
/*     */   public void simulationInit() {}
/*     */   
/*     */   public void simulationPeriodic() {}
/*     */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\Robot.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */