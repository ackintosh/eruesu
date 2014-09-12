import java.io._
import com.github.ackintosh.Ls
import org.scalatest.FunSpec
import org.scalamock.scalatest.MockFactory

class EruesuTest extends FunSpec with MockFactory {
  describe("Eruesu") {
    describe("#ls") {
      it ("returns file/directory names.") {
        val dir = new File(scala.util.Properties.tmpDir, "dir")
        dir.mkdir()
        val child1 = new File(scala.util.Properties.tmpDir, "./dir/child1")
        child1.mkdir()
        val child2 = new File(scala.util.Properties.tmpDir, "./dir/child2")
        child2.mkdir()

        val ls = new Ls(dir)
        assert(ls.output() == "child1 child2")
      }
    }
  }
}
