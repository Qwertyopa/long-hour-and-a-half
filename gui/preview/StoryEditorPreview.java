/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.preview;

import api.*;
import api.Scenes.*;
import java.util.ArrayList;
import javax.swing.tree.TreePath;

/**
 *
 * @author Jonisan
 */
public class StoryEditorPreview extends javax.swing.JFrame
{
    private static final long serialVersionUID = 1L;
    
    private ArrayList<SetupScene> setupScenesList = new ArrayList<>();
    private ArrayList<ActiveScene> activeScenesList = new ArrayList<>();
    static ArrayList<WettingScene> wettingScenesList = new ArrayList<>();
    private ArrayList<api.Character> charactersList = new ArrayList<>();
    private ArrayList<Action> actionsList = new ArrayList<>();
    private ArrayList<Operation> operationsList = new ArrayList<>();
    public static SetupScene currentOperatingSetupScene;
    public static ActiveScene currentOperatingActiveScene;
    public static WettingScene currentOperatingWettingScene;
    public static api.Character currentOperatingCharacter;
    public static Action currentOperatingAction;
    public static Operation currentOperatingOperation;

    /**
     * Creates new form storyEditor
     */
    public StoryEditorPreview()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents()//GEN-BEGIN:initComponents
    {

        jMenuItem4 = new javax.swing.JMenuItem();
        editorSplitPane = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        toolTree = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newStory = new javax.swing.JMenuItem();
        openStory = new javax.swing.JMenuItem();
        saveStory = new javax.swing.JMenuItem();
        saveStoryAs = new javax.swing.JMenuItem();
        quit = new javax.swing.JMenuItem();
        storyMenu = new javax.swing.JMenu();
        newElementMenu = new javax.swing.JMenu();
        newScene = new javax.swing.JMenu();
        newSetupScene = new javax.swing.JMenuItem();
        newActiveScene = new javax.swing.JMenuItem();
        newWettingScene = new javax.swing.JMenuItem();
        newCharacterItem = new javax.swing.JMenuItem();
        newActionItem = new javax.swing.JMenuItem();
        newOperationItem = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Story manifest");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Scenes");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Setup");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("<new setup scene>");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Action");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("<new action scene>");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Wetting");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("<new wetting scene>");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Characters");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("<new character>");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Actions");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("<new action>");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Operations");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("<new operation>");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        toolTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        toolTree.setRootVisible(false);
        toolTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener()
        {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt)
            {
                toolTreeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(toolTree);

        editorSplitPane.setLeftComponent(jScrollPane2);

        fileMenu.setText("File");

        newStory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newStory.setText("New story...");
        fileMenu.add(newStory);

        openStory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openStory.setText("Open story...");
        fileMenu.add(openStory);

        saveStory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveStory.setText("Save story");
        saveStory.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveStoryActionPerformed(evt);
            }
        });
        fileMenu.add(saveStory);

        saveStoryAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveStoryAs.setText("Save story as...");
        saveStoryAs.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveStoryAsActionPerformed(evt);
            }
        });
        fileMenu.add(saveStoryAs);

        quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quitActionPerformed(evt);
            }
        });
        fileMenu.add(quit);

        jMenuBar1.add(fileMenu);

        storyMenu.setText("Story");

        newElementMenu.setText("New");

        newScene.setText("Scene");

        newSetupScene.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        newSetupScene.setText("Setup");
        newSetupScene.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newSetupSceneActionPerformed(evt);
            }
        });
        newScene.add(newSetupScene);

        newActiveScene.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        newActiveScene.setText("Active");
        newActiveScene.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newActiveSceneActionPerformed(evt);
            }
        });
        newScene.add(newActiveScene);

        newWettingScene.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        newWettingScene.setText("Wetting");
        newWettingScene.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newWettingSceneActionPerformed(evt);
            }
        });
        newScene.add(newWettingScene);

        newElementMenu.add(newScene);

        newCharacterItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        newCharacterItem.setText("Character");
        newCharacterItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newCharacterItemActionPerformed(evt);
            }
        });
        newElementMenu.add(newCharacterItem);

        newActionItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        newActionItem.setText("Action");
        newActionItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newActionItemActionPerformed(evt);
            }
        });
        newElementMenu.add(newActionItem);

        newOperationItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        newOperationItem.setText("Operation");
        newOperationItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newOperationItemActionPerformed(evt);
            }
        });
        newElementMenu.add(newOperationItem);

        storyMenu.add(newElementMenu);

        jMenuBar1.add(storyMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editorSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editorSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }//GEN-END:initComponents

    private void saveStoryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveStoryActionPerformed
    {//GEN-HEADEREND:event_saveStoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveStoryActionPerformed

    private void saveStoryAsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveStoryAsActionPerformed
    {//GEN-HEADEREND:event_saveStoryAsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveStoryAsActionPerformed

    private void newWettingSceneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newWettingSceneActionPerformed
    {//GEN-HEADEREND:event_newWettingSceneActionPerformed
        wettingScenesList.add(new WettingScene());
        
        editorSplitPane.setRightComponent(new WettingScenePanelPreview());
        pack();
    }//GEN-LAST:event_newWettingSceneActionPerformed

    private void newSetupSceneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newSetupSceneActionPerformed
    {//GEN-HEADEREND:event_newSetupSceneActionPerformed
        setupScenesList.add(new SetupScene());
        
        editorSplitPane.setRightComponent(new SetupScenePanelPreview());
        pack();
    }//GEN-LAST:event_newSetupSceneActionPerformed

    private void newActiveSceneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newActiveSceneActionPerformed
    {//GEN-HEADEREND:event_newActiveSceneActionPerformed
        activeScenesList.add(new ActiveScene());
        
        editorSplitPane.setRightComponent(new ActiveScenePanelPreview());
        pack();
    }//GEN-LAST:event_newActiveSceneActionPerformed

    private void newCharacterItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newCharacterItemActionPerformed
    {//GEN-HEADEREND:event_newCharacterItemActionPerformed
        charactersList.add(new api.Character());
        
        editorSplitPane.setRightComponent(new CharacterPanelPreview());
        pack();
    }//GEN-LAST:event_newCharacterItemActionPerformed

    private void newActionItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newActionItemActionPerformed
    {//GEN-HEADEREND:event_newActionItemActionPerformed
        actionsList.add(new Action());
        
        editorSplitPane.setRightComponent(new ActionPanelPreview());
        pack();
    }//GEN-LAST:event_newActionItemActionPerformed

    private void newOperationItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newOperationItemActionPerformed
    {//GEN-HEADEREND:event_newOperationItemActionPerformed
        operationsList.add(new Operation());
        
        editorSplitPane.setRightComponent(new OperationPanelPreview());
        pack();
    }//GEN-LAST:event_newOperationItemActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quitActionPerformed
    {//GEN-HEADEREND:event_quitActionPerformed
        SetupFramePreview.main();
        dispose();
    }//GEN-LAST:event_quitActionPerformed

    private void toolTreeValueChanged(javax.swing.event.TreeSelectionEvent evt)//GEN-FIRST:event_toolTreeValueChanged
    {//GEN-HEADEREND:event_toolTreeValueChanged
        TreePath treePathNew = evt.getNewLeadSelectionPath();
        TreePath treePathOld = evt.getOldLeadSelectionPath();
        System.out.println(treePathNew+" "+ treePathOld);
        switchPanel(treePathNew, treePathOld);
    }//GEN-LAST:event_toolTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane editorSplitPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem newActionItem;
    private javax.swing.JMenuItem newActiveScene;
    private javax.swing.JMenuItem newCharacterItem;
    private javax.swing.JMenu newElementMenu;
    private javax.swing.JMenuItem newOperationItem;
    private javax.swing.JMenu newScene;
    private javax.swing.JMenuItem newSetupScene;
    private javax.swing.JMenuItem newStory;
    private javax.swing.JMenuItem newWettingScene;
    private javax.swing.JMenuItem openStory;
    private javax.swing.JMenuItem quit;
    private javax.swing.JMenuItem saveStory;
    private javax.swing.JMenuItem saveStoryAs;
    private javax.swing.JMenu storyMenu;
    private javax.swing.JTree toolTree;
    // End of variables declaration//GEN-END:variables

    private void switchPanel(TreePath treePathNew, TreePath treePathOld)
    {
        String newSelectionParent = (String) treePathNew.getPath()[treePathNew.getPath().length-1];
        String oldSelectionParent = (String) treePathOld.getPath()[treePathOld.getPath().length-1];
        String newSelection = (String) treePathNew.getPath()[treePathNew.getPath().length];
        
        System.out.println(newSelectionParent);
        System.out.println(oldSelectionParent);
        
        switch(oldSelectionParent)
        {
            case "Setup":
                SetupScenePanelPreview.onClose();
                break;
            case "Active":
                ActiveScenePanelPreview.onClose();
                break;
            case "Wetting":
                WettingScenePanelPreview.onClose();
                break;
            case "Characters":
                CharacterPanelPreview.onClose();
                break;
            case "Actions":
                ActionPanelPreview.onClose();
                break;
            case "Operations":
                OperationPanelPreview.onClose();
                break;
        }
        
        switch(newSelectionParent)
        {
            case "root":
                if(newSelection.equals("Story manifest"))
                {
                    editorSplitPane.setRightComponent(new StoryManifestPanelPreview());
                    pack();
                }
                break;
            case "Setup":
                if(newSelection.equals("<new setup scene>"))
                {
                    setupScenesList.add(new SetupScene());
                }
                else
                {
                    setupScenesList.stream().filter((iScene) -> (iScene.getSceneTitle().equals(newSelection))).forEachOrdered((iScene) ->
                    {
                        currentOperatingSetupScene = iScene;
                    });
                }
                editorSplitPane.setRightComponent(new SetupScenePanelPreview());
                pack();
                break;
            case "Active":
                if(newSelection.equals("<new active scene>"))
                {
                    activeScenesList.add(new ActiveScene());
                }
                else
                {
                    activeScenesList.stream().filter((iScene) -> (iScene.getSceneTitle().equals(newSelection))).forEachOrdered((iScene) ->
                    {
                        currentOperatingActiveScene = iScene;
                    });
                }
                editorSplitPane.setRightComponent(new ActiveScenePanelPreview());
                pack();
                break;
            case "Wetting":
                if(newSelection.equals("<new wetting scene>"))
                {
                    wettingScenesList.add(new WettingScene());
                }
                else
                {
                    wettingScenesList.stream().filter((iScene) -> (iScene.getSceneTitle().equals(newSelection))).forEachOrdered((iScene) ->
                    {
                        currentOperatingWettingScene = iScene;
                    });
                }
                editorSplitPane.setRightComponent(new WettingScenePanelPreview());
                pack();
                break;
            case "Characters":
                if(newSelection.equals("<new character>"))
                {
                    charactersList.add(new api.Character());
                }
                else
                {
                    charactersList.stream().filter((iCharacter) -> (iCharacter.getName().equals(newSelection))).forEachOrdered((iCharacter) ->
                    {
                        currentOperatingCharacter = iCharacter;
                    });
                }
                editorSplitPane.setRightComponent(new CharacterPanelPreview());
                pack();
                break;
            case "Actions":
                if(newSelection.equals("<new action>"))
                {
                    actionsList.add(new Action());
                }
                else
                {
                    actionsList.stream().filter((iAction) -> (iAction.getName().equals(newSelection))).forEachOrdered((iAction) ->
                    {
                        currentOperatingAction = iAction;
                    });
                }
                editorSplitPane.setRightComponent(new ActionPanelPreview());
                pack();
                break;
            case "Operations":
                if(newSelection.equals("<new operation>"))
                {
                    operationsList.add(new Operation());
                }
                else
                {
                    operationsList.stream().filter((iOperation) -> (iOperation.getName().equals(newSelection))).forEachOrdered((iOperation) ->
                    {
                        currentOperatingOperation = iOperation;
                    });
                }
                editorSplitPane.setRightComponent(new OperationPanelPreview());
                pack();
                break;
        }
    }
}
