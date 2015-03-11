package io.takari.maven.plugins.dependency;

import io.takari.maven.plugins.dependency.tree.serializer.DotRenderer;
import io.takari.maven.plugins.dependency.tree.serializer.TreeRenderer;

import java.io.File;

import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "dot")
public class DotTree extends AbstractTree {

  @Override
  protected TreeRenderer renderer() {
    return new DotRenderer(new File("graph.txt"));
  }
}
