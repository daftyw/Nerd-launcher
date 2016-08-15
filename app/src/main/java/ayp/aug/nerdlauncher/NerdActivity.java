package ayp.aug.nerdlauncher;

import android.support.v4.app.Fragment;

public class NerdActivity extends SingleFragmentActivity {

    @Override
    protected Fragment onCreateFragment() {
        return NerdFragment.newInstance();
    }
}
