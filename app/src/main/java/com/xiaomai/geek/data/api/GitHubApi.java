package com.xiaomai.geek.data.api;

import android.support.annotation.StringDef;

import com.xiaomai.geek.data.module.Repo;

import java.util.ArrayList;

import rx.Observable;

/**
 * Created by XiaoMai on 2017/4/21.
 */

public interface GitHubApi {

    String LANG_JAVA = "java";

    String LANG_OC = "objective-c";

    String LANG_SWIFT = "swift";

    String LANG_HTML = "html";

    String LANG_PYTHON = "python";

    String LANG_BASH = "shell";

    Observable<ArrayList<Repo>> getTrendingRepos(@LanguageType String language);

    @StringDef({
            LANG_JAVA, LANG_OC, LANG_SWIFT, LANG_HTML, LANG_PYTHON, LANG_BASH
    })
    @interface LanguageType {
    }
}